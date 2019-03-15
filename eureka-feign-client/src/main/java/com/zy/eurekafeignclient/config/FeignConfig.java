package com.zy.eurekafeignclient.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author czy
 * @date 2019/3/15 17:15
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }
}
