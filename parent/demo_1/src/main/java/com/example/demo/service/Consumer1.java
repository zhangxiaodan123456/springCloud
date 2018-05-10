package com.example.demo.service;

import java.io.IOException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class Consumer1 {
	  private static final String EXCHANGE_NAME = "logs";
	  public final static String QUEUE_NAME="myfirstqueue";
	  public static void main(String[] argv) throws Exception {
		  ConnectionFactory factory = new ConnectionFactory();
	        //设置RabbitMQ相关信息
	        factory.setHost("192.168.95.131");
	         factory.setUsername("test");
	         factory.setPassword("test");
	         factory.setPort(5672);
	    Connection connection = factory.newConnection();
	    Channel channel = connection.createChannel();

	    channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
	    String queueName = channel.queueDeclare().getQueue();
	    channel.queueBind("myfirstqueue", EXCHANGE_NAME, "");
	    System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
	    Consumer consumer = new DefaultConsumer(channel) {
	      @Override
	      public void handleDelivery(String consumerTag, Envelope envelope,
	                                 AMQP.BasicProperties properties, byte[] body) throws IOException {
	        String message = new String(body, "UTF-8");
	        System.out.println(" [x] Received '" + message + "'");
	      }
	    };
	    channel.basicConsume(queueName, true, consumer);
	  }
}
