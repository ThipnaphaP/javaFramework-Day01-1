package javaframework.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

	@Test
	public void case01() {
		
		Hello  hello = new Hello();
		String  actualResult = hello.sayHi("Thipnapha");
		assertEquals("Hello , Thipnapha", actualResult);
		
	}
}
