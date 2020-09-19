package id.co.setyowidi.rabbitmqtraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;


@SpringBootApplication
public class RabbitMqTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqTrainingApplication.class, args);
	}

}
