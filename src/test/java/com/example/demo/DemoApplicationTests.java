package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
    public void testAdd() {
		DemoApplication calc = new DemoApplication();
		assertEquals(5, calc.add(2, 3));
   	}

    @Test
   	public void testSubtract() {
		DemoApplication calc = new DemoApplication();
		assertEquals(1, calc.sub(3, 2));
   	}
		

}
