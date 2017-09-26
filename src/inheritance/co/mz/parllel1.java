package inheritance.co.mz;

import org.testng.annotations.Test;

public class parllel1 {

	@Test
	public void Testcase4()
	{
		long id = Thread.currentThread().getId();
		System.out.println("test case 4 is successfull....." + id);
	}
	
	@Test
	public void Testcase5()
	{
		long id = Thread.currentThread().getId();
		System.out.println("test case 5 is successfull....." + id);
	}
	@Test
	public void Testcase6()
	{
		long id = Thread.currentThread().getId();
		System.out.println("test case 6 is successfull....." + id);
	}

}
