package ddt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement login_ele=driver.findElement(By.name("login"));
		login_ele.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		login_ele.click();

	}

}

