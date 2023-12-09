package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Calci.Calculator;

class CalculatorTest {
	static Calculator c;
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("beforeAll");
		 c=new Calculator();
		 
	}
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("beforeEach");
		
	}

	@Test
	@DisplayName("add")
	void testAdd() {
		//Calculator c=new Calculator();
		int actual=c.add(4,5);
		assertEquals(9,actual);
		//assertNotNull(actual);
		System.out.println("testadd");
	}
	

	@Test
	@DisplayName("sub")
	void testSub() {
		//Calculator c=new Calculator();
		int actual=c.sub(5,5);
		assertEquals(0,actual);
		assertNotEquals(1,actual);
		System.out.println("testsub");
		
	}
	@AfterEach
	public  void afterEach()
	{
		System.out.println("afterEach");
		
	}
	@AfterAll
	public static void afterAll()
	{
		System.out.println("AfterAll");
		 
	}


}
