package com.zy.eurekaribbonclient.service;

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

    public String getHi(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }
}
