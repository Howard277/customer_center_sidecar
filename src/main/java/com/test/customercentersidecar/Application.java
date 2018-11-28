package com.test.customercentersidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.sidecar.EnableSidecar;

//@EnableSidecar
@EnableDiscoveryClient
@SpringBootApplication
public class Application {

    // 启动cas模块
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
