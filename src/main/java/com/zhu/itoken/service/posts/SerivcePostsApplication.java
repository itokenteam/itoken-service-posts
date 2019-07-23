package com.zhu.itoken.service.posts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SerivcePostsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SerivcePostsApplication.class, args);
    }
}
