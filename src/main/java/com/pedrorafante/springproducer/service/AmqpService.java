package com.pedrorafante.springproducer.service;

import com.pedrorafante.springproducer.dto.Message;

public interface AmqpService {
    void sendToConsumer(Message message);
}
