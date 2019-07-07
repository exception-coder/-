package cn.exceptioncoder.micorservice.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/index")
    public String index(@RequestParam(name = "consumer",required = false) String consumer){
        return "hello "+consumer;
    }
}
