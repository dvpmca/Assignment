package com.provider.billing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.provider.billing.utility.Order;

@SpringBootApplication
public class BillingAppApplication {

	
	public static void main(String[] args) {
		
	ApplicationContext c =	SpringApplication.run(BillingAppApplication.class, args);
		
		Order order = c.getBean(Order.class);
		order.orderItems();
		
		}
	}


