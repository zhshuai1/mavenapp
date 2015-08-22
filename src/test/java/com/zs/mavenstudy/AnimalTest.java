package com.zs.mavenstudy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Think
 *
 */
public class AnimalTest {
	@Test
	public void test() {
		Animal animal = new Animal("Animal", 12, 13);
		animal.setHeight(34);
		animal.setWeight(10);
		animal.setName("Gaoxing");
		assertEquals("Gaoxing", animal.getName());
		assertEquals(34, animal.getHeight());
		assertEquals(10, animal.getWeight());
		animal.toString();
	}

}
