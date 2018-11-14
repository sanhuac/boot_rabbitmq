package com.hc.boot_rabbitmq.mq_provider;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author hucong
 * @Description 最简单的hello生产和消费实现（单生产者和单消费者）
 * @Date $ $
 **/
@Component
public class HelloSender1 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String sendMsg = "hello1 " + "****" +" 胡丛消息队列一";
        System.out.println("消息发送者1 : " + sendMsg);
        this.rabbitTemplate.convertAndSend("helloQueue", sendMsg);
    }

    public void send(String msg) {
        String sendMsg = msg + new Date();
        System.out.println("消息发送者1 : " + sendMsg);
        this.rabbitTemplate.convertAndSend("helloQueue", sendMsg);
    }
}
