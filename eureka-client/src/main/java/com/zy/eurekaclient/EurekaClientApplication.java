package com.zy.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author czy
 * @date 2019/3/11 15:23
 */
@EnableEurekaClient
@SpringBootApplication
//@RestController
public class EurekaClientApplication {


	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

//	@Value("${server.port}")
//	String foo;
//	@RequestMapping("/foo")
//	public String getHi() {
//		return foo;
//	}

}
