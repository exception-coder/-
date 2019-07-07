package cn.exceptioncoder.spring.boot.configuration;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "micorservice-provider",configuration = MicorserviceProvideConfiguration.class)
public class RibbonConfiguration {
}
