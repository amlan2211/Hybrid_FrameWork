package Dt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_Login 
{
	@DataProvider(name="login")
	public String[][] getData()
	{
		String data[][]= {{"abc","123"},{"xyz","321"}};
		return data;
	}
	@Test(dataProvider="login")
	public void test(String un,String pwd)
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
