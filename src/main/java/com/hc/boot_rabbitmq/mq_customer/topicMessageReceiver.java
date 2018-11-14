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
@RabbitListener(queues = "topic.message")
public class topicMessageReceiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("topicMessageReceiver  : " +msg);
    }
}
