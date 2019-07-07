package cn.exceptioncoder.spring.boot.controller;

import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @SneakyThrows
    @GetMapping("/hello")
    public String index() {
        Thread.sleep(10000);
        return "Hello World";
    }
}
