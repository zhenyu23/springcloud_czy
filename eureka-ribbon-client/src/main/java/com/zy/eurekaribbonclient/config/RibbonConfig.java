package com.zy.eurekaribbonclient.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author czy
 * @date 2019/3/13 10:02
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
