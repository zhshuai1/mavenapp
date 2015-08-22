package com.zs.mavenstudy;

public class AnimalShow {
	private Animal animal = new Animal("Sheep", 10, 10);

	public void show() {
		print(animal.getName());
		print(animal.getName());
		print(animal.getName());
		print(animal.getHeight());
	}

	public String concatAnimals() {
		String names = "";
		for (int i = 0; i < 2; ++i) {
			names += animal.getName();
		}
		return names;
	}

	public void print(Object object) {
		System.out.println(object);
	}

}
