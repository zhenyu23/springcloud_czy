package com.zy.eurekafeignclient;

import com.zy.eurekafeignclient.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author czy
 * @date 2019/3/15 17:19
 */
@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = ErrorHandleFeign.class)
public interface EurekaFeignClient {
    @GetMapping("/hi")
     String getHi(@RequestParam("name") String name);
}
