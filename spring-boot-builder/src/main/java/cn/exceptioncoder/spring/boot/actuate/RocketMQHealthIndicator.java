package cn.exceptioncoder.spring.boot.actuate;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class RocketMQHealthIndicator implements HealthIndicator {


    @Override
    public Health health() {
        int errorCode = check();
        if(errorCode!=1){
            return Health.down().withDetail("Error Code",errorCode).build();
        }
        return Health.up().build();
    }

    private int check(){
        // TODO: 19-7-4 对监控对象的检测操作
        return 0;
    }
}
