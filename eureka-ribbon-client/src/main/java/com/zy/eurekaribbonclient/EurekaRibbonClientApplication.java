package com.zy.eurekaribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @author czy
 * @date: 2019/3/13 10:01
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRibbonClientApplication.class, args);
	}

}
