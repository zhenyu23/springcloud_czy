package com.zy.ribbonclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author czy
 * @date 2019/3/13 15:44
 */
@RestController
public class RibbonController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/load")
    public String test(){
        ServiceInstance instance=loadBalancerClient.choose("stores");
        return instance.getHost()+" : "+instance.getPort();
    }
}
