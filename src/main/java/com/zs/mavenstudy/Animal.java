package com.zs.mavenstudy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Animal {
	private String name;
	private int weight;
	private int height;

	public void introduce() {
		print("Hello, my name is " + name);
		print("My weight is " + weight);
		print("My height is " + height);
	}

	protected void print(Object object) {
		System.out.println(object);
	}
}
