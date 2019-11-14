package com.zy.eurekafeignclient;

import org.springframework.stereotype.Component;

/**
 * @Author czy
 * @Description
 * @Date 2019/11/14 13:54
 */
@Component
public class ErrorHandleFeign implements EurekaFeignClient {
    @Override
    public String getHi(String name) {
        return "Feign 的熔断器处理方法来了";
    }
}
