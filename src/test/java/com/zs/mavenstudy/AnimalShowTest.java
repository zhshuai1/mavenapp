package com.zs.mavenstudy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class AnimalShowTest {
	@InjectMocks
	private AnimalShow animalShow = new AnimalShow();
	@Mock
	private Animal animal;

	@Before
	public void Init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		when(animal.getName()).thenReturn("123").thenReturn("456");
		when(animal.getHeight()).thenReturn(67);
		animalShow.show();
		assertEquals("456456", animalShow.concatAnimals());
	}

}
