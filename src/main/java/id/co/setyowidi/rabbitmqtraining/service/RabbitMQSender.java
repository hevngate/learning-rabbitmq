package id.co.setyowidi.rabbitmqtraining.service;

import id.co.setyowidi.rabbitmqtraining.model.Staff;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {
    @Autowired
    private AmqpTemplate rabbitTemplate1;

    @Value("${training.rabbitmq.exchange}")
    private String exchange;

    @Value("${training.rabbitmq.routingkey}")
    private String routingkey;

    public void send(Staff staff) {
        rabbitTemplate1.convertAndSend(exchange, routingkey, staff);
        System.out.println("Send msg = " + staff);

    }

}
