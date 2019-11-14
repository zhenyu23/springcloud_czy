package com.zy.eurekaribbonclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author czy
 * @date 2019/3/13 11:41
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String getHi(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "Hi" +name +"Sorry,It's wrong";
    }

}
