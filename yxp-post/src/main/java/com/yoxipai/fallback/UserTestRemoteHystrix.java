package com.yoxipai.fallback;

import com.yoxipai.remote.UserTestRemote;
import org.springframework.stereotype.Component;

@Component
public class UserTestRemoteHystrix implements UserTestRemote {

    @Override
    public void userTest(String id) {
        System.out.println("调用user test接口异常，id ===> " + id);
    }
}
