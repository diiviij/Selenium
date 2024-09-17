package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected WebDriver Driver = null;
	@Parameters({"browser","Url"})

	@BeforeTest
	public void setup(String Browser,String Url) {
	if(Browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
		
	}else if(Browser.equalsIgnoreCase("Firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		Driver=new FirefoxDriver();
	}
	Driver.manage().window().maximize();
	Driver.get(Url);
	System.out.println("Current Url: "+Driver.getCurrentUrl());

	}

	
	
	
	@AfterClass
	public void teardown()
	{
		Driver.quit();
	}
}
