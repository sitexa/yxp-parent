package com.yoxipai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class YxpDashboardServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(YxpDashboardServerApplication.class, args);
    }
}
