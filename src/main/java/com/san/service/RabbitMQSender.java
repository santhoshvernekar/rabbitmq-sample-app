package com.san.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.san.model.Employee;


@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${san.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${san.rabbitmq.routingkey}")
	private String routingkey;	
	String rabbitTopic = "san_topic";
	
	public void send(Employee employee) {
		amqpTemplate.convertAndSend(exchange, routingkey, employee);
		System.out.println("Send msg = " + employee);
	    
	}
}