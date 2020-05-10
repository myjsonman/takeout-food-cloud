package com.kavy.takeoutfoodorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kavy.takeoutfoodorder.mapper")
@EnableDiscoveryClient
public class TakeoutFoodOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeoutFoodOrderApplication.class, args);
    }

}
