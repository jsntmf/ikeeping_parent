package com.zz.ikeeping.server.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DJL
 * @create 2019-06-25 21:39
 * @desc ${DESCRIPTION}
 **/
@SpringBootApplication
@EnableEurekaClient
public class ServerShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerShopApplication.class, args);
    }
}
