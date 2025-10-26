package com.provider.billing.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
//@Scope("prototype")
public class Item {
	private String name;
	private Integer price;

}
