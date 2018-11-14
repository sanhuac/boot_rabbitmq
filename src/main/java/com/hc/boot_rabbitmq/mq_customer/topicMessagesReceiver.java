package com.hc.boot_rabbitmq.mq_customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @Author hucong
 * @Description
 * topic 是RabbitMQ中最灵活的一种方式，可以根据binding_key自由的绑定不同的队列
 *
 * 首先对topic规则配置，这里使用两个队列来测试（也就是在Application类中创建和绑定的topic.message和topic.messages两个队列），其中topic.message的bindting_key为
 *
 * “topic.message”，topic.messages的binding_key为“topic.#”；
 * @Date $ $
 **/
@Component
@RabbitListener(queues = "topic.messages")
public class topicMessagesReceiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("topicMessagesReceiver  : " +msg);
    }
}
