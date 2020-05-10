package com.kavy.takeoutfoodmenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.kavy.takeoutfoodmenu.mapper")
@EnableDiscoveryClient
public class TakeoutFoodMenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeoutFoodMenuApplication.class, args);
    }

}
