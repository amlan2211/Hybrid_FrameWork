package JavaScript;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ts1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("https://www.youtube.com/");
		TakesScreenshot tss=(TakesScreenshot) driver;
		File s=tss.getScreenshotAs(OutputType.FILE);
		File d= new File("./Screenshot/a1.png");
		FileHandler.copy(s,d);
		
		

	}

	
		
	}

}
