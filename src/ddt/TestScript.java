package ddt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestScript 
{
 @Test
 public void test() throws InterruptedException 
 {
	 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		Pom p=new Pom(driver);
		p.login_btn();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.login_btn();
		
 }
}
