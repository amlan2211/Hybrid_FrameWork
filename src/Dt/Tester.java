package Dt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Tester 
{
	@Test
	public void login_script() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./data/Properties"));
		String value=p.getProperty("UN");
		System.out.println(value);
	}

}
