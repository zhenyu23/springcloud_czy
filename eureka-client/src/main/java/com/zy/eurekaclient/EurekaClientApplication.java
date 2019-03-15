package com.zy.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author czy
 * @date 2019/3/11 15:23
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {


	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}
