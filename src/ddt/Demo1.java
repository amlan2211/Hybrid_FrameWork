package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void test1() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		List<WebElement> all_links=driver.findElements(By.xpath("//a"));
		FileInputStream fis =new FileInputStream("./Excel/Excel1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		int size=all_links.size();
		for(int i=0;i<size;i++)
		{
		     Row r=sh.createRow(i);
		     Cell c=r.createCell(0);
		     c.setCellValue(all_links.get(i).getAttribute("href"));
		}
		FileOutputStream fos=new FileOutputStream("./Excel/Excel1.xlsx");
		book.write(fos);
		
		
	}
  
}
