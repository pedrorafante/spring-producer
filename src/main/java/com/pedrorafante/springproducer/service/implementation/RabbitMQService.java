package com.pedrorafante.springproducer.service.implementation;

import com.pedrorafante.springproducer.amqp.AmqpProducer;
import com.pedrorafante.springproducer.dto.Message;
import com.pedrorafante.springproducer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService implements AmqpService {

    @Autowired
    private AmqpProducer<Message> amqp;

    @Override
    public void sendToConsumer(Message message) {
        amqp.producer(message);
    }
}
