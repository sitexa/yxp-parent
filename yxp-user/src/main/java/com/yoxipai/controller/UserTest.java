package com.yoxipai.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserTest {
    private Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Value("${profile}")
    private String profile;

    @GetMapping("/user/test/{id}")
    @HystrixCommand(fallbackMethod = "userTestFallback")
    public void userTest(@PathVariable("id") String id) {
        logger.info("id ===> " + id + ", profile=" + profile);
        throw new RuntimeException("exception throw");
    }

    public void userTestFallback(String id) {
        logger.info("出错了。。。id ===> " + id);
    }
}
