package id.co.setyowidi.rabbitmqtraining.service;

import id.co.setyowidi.rabbitmqtraining.model.Staff;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQReceiver  {
    @RabbitListener(queues = "${training.rabbitmq.queue}")
    public void recievedMessage(Staff staff) {
        System.out.println("Recieved Message From RabbitMQ: " + staff);
    }
}
