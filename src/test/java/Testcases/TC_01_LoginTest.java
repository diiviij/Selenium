package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;

public class TC_01_LoginTest extends BaseClass{

	@Test(priority=1)
	public void Login() throws InterruptedException
	{
		WebElement email=Driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("nandhakumaaran.s@sys-core.com");
		WebElement pass=Driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Init@2024");
		Thread.sleep(2000);
		WebElement signin=Driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		Thread.sleep(8000);
		WebElement dashboard=Driver.findElement(By.xpath("//h2[normalize-space(text())=\"Dashboard\"]"));
		boolean status=dashboard.isDisplayed();
		if(status==true)
		{
			System.out.println("Login success!!!");
		}
		else
		{
			System.out.println("Login failed");
		}
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void ProjectEnrollment() throws InterruptedException
	{
		WebElement projectbtn=Driver.findElement(By.xpath("//a[contains(text(),'WELL Certification')]"));
		projectbtn.click();
		Thread.sleep(4000);
		JavascriptExecutor js= (JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(4000);
	}
	
	@Test(priority=3)
	public void logout() throws InterruptedException
	{
		WebElement logouticon=Driver.findElement(By.xpath("//div[@class=\"h-8 w-8 rounded-full bg-cover overflow-hidden\"]"));
		logouticon.click();
		Thread.sleep(5000);
		System.out.println("Logout icon clicked");
		WebElement logout=Driver.findElement(By.xpath("//div[@class=\"w-full flex justify-end\"]/descendant::button"));
		logout.click();
		System.out.println("Logged out");
		Thread.sleep(6000);
	}
	
	
	

}
