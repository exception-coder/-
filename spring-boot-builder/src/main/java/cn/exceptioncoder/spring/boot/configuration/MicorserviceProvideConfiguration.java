package cn.exceptioncoder.spring.boot.configuration;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.NoOpPing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MicorserviceProvideConfiguration {

    @Bean
    public IPing iPing(){
        return new NoOpPing();
    }

}

