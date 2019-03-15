package com.zy.eurekaribbonclient.controller;

import com.netflix.ribbon.Ribbon;
import com.zy.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author czy
 * @date 2019/3/13 13:19
 */
@RestController
public class RibbonController {


    RibbonService ribbonService;
    @Autowired
    public RibbonController(RibbonService ribbonService){
        this.ribbonService=ribbonService;
    }

    @GetMapping("/hi")
    public String Hi(@RequestParam(required = false) String name){
        return ribbonService.getHi(name);
    }
}
