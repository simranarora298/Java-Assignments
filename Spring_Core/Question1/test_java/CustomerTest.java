package spring.question1;

import static org.junit.jupiter.api.Assertions.*;


//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
	public Customer cust;
	
	@BeforeEach
	public  void init()
	{
		cust = new Customer(1,"Rahul",12345678 ,
				new Address("main road","east delhi","Delhi", 123456, "India") );
	}
	
	@Test
	void testGetCustomerId() 
	{
		int expected = 1;
		int actual = cust.getCustomerId();
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}

	@Test
	void testGetCustomerName() 
	{
		String expected="Rahul";
		String actual = cust.getCustomerName();
		assertEquals(expected,actual);
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetCustomerContact() 
	{
		assertEquals(12345678,cust.getCustomerContact());
		//fail("Not yet implemented");
	}

	@Test
	void testGetCustomerAddress() 
	{
		assertAll( "address",
		()->assertEquals("main road",cust.getCustomerAddress().getStreet()),
		()->assertEquals("east delhi",cust.getCustomerAddress().getCity()),
		()->assertEquals("Delhi",cust.getCustomerAddress().getState()),
		()->assertEquals(123456, cust.getCustomerAddress().getZipcode()),
		()->assertEquals("India",cust.getCustomerAddress().getCountry())
		);
		
		//fail("Not yet implemented");
	}

}
