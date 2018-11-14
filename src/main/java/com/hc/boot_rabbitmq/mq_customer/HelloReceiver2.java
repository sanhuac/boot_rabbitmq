package com.hc.boot_rabbitmq.mq_customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @Author hucong
 * @Description //TODO $
 * @Date $ $
 **/
@Component
@RabbitListener(queues = "helloQueue")//
public class HelloReceiver2 {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("消息接受者2  : " + hello);
    }
}
