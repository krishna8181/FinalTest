package inheritance.co.mz;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class group {
	
	@BeforeTest(groups = {"regression"})
	public void login()
	{
		System.out.println("Successfully logged in ");
	}
	
	
	@Test(groups = {"regression","sanity"}, priority = 2)
	public void addvendor()
	{
		System.out.println("Successfully added vendor");
	}

	@Test(groups = {"regression","sanity"},priority = 4)
	public void addproduct()
	{
		System.out.println("Successfully added product");
	}
	
	@Test(groups = {"sanity"}, priority =3)
	public void search()
	{
		System.out.println("Successfully search");
	}
	
	
	@AfterGroups(groups = {"regression"})
	public void logout()
	{
		System.out.println("Successfully logged out");
	}
	
	
}
