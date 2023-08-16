package TestNg;



import org.testng.annotations.Test;

public class Demo {
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("signup");
	}
	
	@Test(priority = 2)
	public void test2()
	{
		System.out.println("login");
	}
	@Test(priority = 4)
	public void test3()
	{
		System.out.println("logout");
	}

}
