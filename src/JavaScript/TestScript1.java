package JavaScript;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class TestScript1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		driver.get("file:///C:/Users/91784/Desktop/Demo13.html");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('a1').value='50'");
		

	}

}
