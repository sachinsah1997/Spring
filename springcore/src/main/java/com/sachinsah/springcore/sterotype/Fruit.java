package com.sachinsah.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Fruit {

	@Value("Mango")
	private String name;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int price;
	
	public int getPrice() {
		return price;
	}
	
	@Value("#{new java.lang.String('seasonal')}")
	private String type;

	public String getType() {
		return type;
	}
	
	@Value("#{7>2}")
	private boolean isAvailable;

	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Value("#{phonNumberList}")
	private List<String> types;
	
	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", type=" + type + ", isAvailable=" + isAvailable
				+ ", types=" + types + "]";
	}
	
	
}
