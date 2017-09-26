package inheritance.co.mz;

import org.testng.annotations.Test;

public class parllel {

	@Test
	public void Testcase1()
	{
		long id = Thread.currentThread().getId();
		System.out.println("test case 1 is successfull....." + id);
	}
	
	@Test
	public void Testcase2()
	{
		long id = Thread.currentThread().getId();
		System.out.println("test case 2 is successfull....." + id);
	}
	@Test
	public void Testcase3()
	{
		long id = Thread.currentThread().getId();
		System.out.println("test case 3 is successfull....." + id);
	}
	
	
	
}
