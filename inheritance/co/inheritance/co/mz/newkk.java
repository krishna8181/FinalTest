package inheritance.co.inheritance.co.mz;

import org.testng.annotations.Test;

public class newkk {

	@BeforeClass
	public void login()
	{
		System.out.println("Successfully logged")
	}
	
	
	@Test
	public void addvendor()
	{
		System.out.println("product vendor successfull");
	}
	
	@Test
	public void addproduct()
	{
		System.out.println("add product successfull");
	}
	
	@Test
	public void addcurrency()
	{
		System.out.println("add currency successfull");
	}
	
	
	
	@AFterClass
	public void logout()
	{
		System.out.println("Successfully logout")
	}
	
}
