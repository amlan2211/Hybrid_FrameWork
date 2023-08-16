package ddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 
{   
	@FindBy(id="username")
	private WebElement un;
	@FindBy(name="pwd")
	private WebElement pass;
	@FindBy(xpath= "//div[.='Login '")
	private WebElement ele_btn;
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void un_textfield()
	{
		un.sendKeys("admin");
	}
	public void pwd_textfield()
	{
		pass.sendKeys("manager");
	}
	public void login_btn()
	{
		ele_btn.click();
	}


}
