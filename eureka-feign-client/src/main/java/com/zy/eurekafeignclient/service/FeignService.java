package com.zy.eurekafeignclient.service;

import com.zy.eurekafeignclient.EurekaFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author czy
 * @date 2019/3/15 17:25
 */
@Service
public class FeignService {
    EurekaFeignClient eurekaFeignClient;

    @Autowired
    public FeignService(EurekaFeignClient eurekaFeignClient){
        this.eurekaFeignClient=eurekaFeignClient;
    }

    public String getHi(String name){
        return eurekaFeignClient.getHi(name);
    }
}
