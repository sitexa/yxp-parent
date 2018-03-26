package com.yoxipai.remote;

import com.yoxipai.fallback.UserTestRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "yxp-user", fallback = UserTestRemoteHystrix.class)
public interface UserTestRemote {

    @RequestMapping(value = "/user/test/{id}", method = RequestMethod.GET)
    public void userTest(@PathVariable("id") String id);
}
