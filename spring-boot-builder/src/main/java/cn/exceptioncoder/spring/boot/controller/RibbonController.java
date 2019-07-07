package cn.exceptioncoder.spring.boot.controller;


import com.alibaba.fastjson.JSON;
import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *Ø
 *
 * RibbonNacosAutoConfiguration
 *
 */
@Slf4j
@RestController
public class RibbonController {


    /**
     *
     * 标记使用负载均衡客户端
     *
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate loadBalancedRestTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate loadBalancedRestTemplate;


    @GetMapping("/ribbon")
    public String ribbon(){
        ResponseEntity<String> responseEntity = loadBalancedRestTemplate.getForEntity("http://micorservice-provider/index?consumer=hello",String.class);
        log.warn(responseEntity.getBody());
        responseEntity = loadBalancedRestTemplate.getForEntity("http://hello/hello",String.class);
        log.warn(responseEntity.getBody());
        return "ribbon";
    }




}
