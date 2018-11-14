package com.hc.boot_rabbitmq.controller;

import com.hc.boot_rabbitmq.mq_provider.UserSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hucong
 * @Description //TODO $
 * @Date $ $
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserSender userSender;

    /**
     * 实体类传输测试
     */
    @PostMapping("/userTest")
    public void userTest() {
        userSender.send();
    }


}
