package com.hc.boot_rabbitmq.mq_customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @Author hucong
 * @Description 消费者
 * @Date $ $
 **/
@Component
@RabbitListener(queues = "helloQueue")//
public class HelloReceiver1 {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("消息接受者1  : " + hello);
    }
}
