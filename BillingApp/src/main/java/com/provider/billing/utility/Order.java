package com.provider.billing.utility;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties.ShowSummary;
import org.springframework.stereotype.Component;

import com.provider.billing.model.Item;
@Component
public class Order {
	@Autowired
	private Menu menu;
	@Autowired
	private Item item;
	public void orderItems(){
		List<Item> items = null;
		items =menu.menuItems();
		System.out.println("selected items");
		Integer total=0;
		
		for (Item item : items) {
			total+=item.getPrice();
			System.out.println(item);
			
		}
		System.out.println("total bill is " + total);
		}

}
