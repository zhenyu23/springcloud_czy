package com.zy.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author czy
 * @date 2019/3/11 17:43
 */
@RestController
public class EurekaClientTest {

    @Value("${server.port}")
    private int port;

    @GetMapping("/hi")
    public String getHome(@RequestParam String name){
        return "hi！ "+name+"  port is:"+port;
    }

    @GetMapping("/testRest")
    public String getBaidu(){
        RestTemplate restTemplate=new RestTemplate();

        return restTemplate.getForObject("https://www.baidu.com/",String.class);
    }

}
