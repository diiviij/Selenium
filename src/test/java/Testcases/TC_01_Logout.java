package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class TC_01_Logout extends BaseClass{
	
	@Test(priority=3)
	public void Logout() throws InterruptedException
	{
		WebElement logouticon=Driver.findElement(By.xpath("//div[@class=\"h-8 w-8 rounded-full bg-cover overflow-hidden\"]"));
		logouticon.click();
		Thread.sleep(5000);
	}
	
	
}
