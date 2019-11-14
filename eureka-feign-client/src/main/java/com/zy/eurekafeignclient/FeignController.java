package com.zy.eurekafeignclient;

import com.zy.eurekafeignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author czy
 * @date 2019/3/15 17:21
 */
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping("/hia")
    public String getHi(String name){
        return feignService.getHi(name);
    }
}
