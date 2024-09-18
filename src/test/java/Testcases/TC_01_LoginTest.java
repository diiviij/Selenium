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
		
		
		WebElement email = Driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("divij.jain@sys-core.com");
		
		WebElement password=Driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Init$2024");
	
		WebElement login =Driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(4000);
		Thread.sleep(8000);
		WebElement projectenrol = Driver.findElement(By.xpath("//a[contains(text(),'WELL Certification')]"));
		projectenrol.click();
		Thread.sleep(6000);
		
		
		WebElement startprojectv = Driver.findElement(By.xpath("//button[contains(text(),'Start a v2 Project')]"));
		startprojectv.click();
		Thread.sleep(4000);
		
		

	}
	
	
	/*@Test(priority=2)
	public void ProjectEnrollment() throws InterruptedException
	{
		Thread.sleep(8000);
		WebElement projectenrol = Driver.findElement(By.xpath("//a[contains(text(),'WELL Certification')]"));
		projectenrol.click();
		Thread.sleep(6000);
		
		
		WebElement startprojectv = Driver.findElement(By.xpath("//button[contains(text(),'Start a v2 Project')]"));
		startprojectv.click();
		Thread.sleep(4000);
	} 
*/
	

}
