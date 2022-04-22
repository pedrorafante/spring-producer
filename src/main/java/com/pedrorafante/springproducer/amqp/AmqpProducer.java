package com.pedrorafante.springproducer.amqp;

public interface AmqpProducer<T> {

    void producer(T t);


}
