package com.yoxipai.controller;

import com.yoxipai.remote.UserTestRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostTest {
    private Logger logger = LoggerFactory.getLogger(PostTest.class);

    @Autowired
    private UserTestRemote userTestRemote;

    @GetMapping("/post/test")
    public void postTest() {
        logger.info("postTest in");
        userTestRemote.userTest("112233");
    }
}
