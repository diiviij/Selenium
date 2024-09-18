package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = null;
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
		
		
		Driver.get("https://test-nuxt.wellcertified.com/");
		Driver.manage().window().maximize();
		Driver.manage().window().fullscreen();
		WebElement email = Driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("divij.jain@sys-core.com");
		
		WebElement password=Driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Init$2024");
	
		WebElement login =Driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(4000);

		WebElement projectenrol = Driver.findElement(By.xpath("//a[contains(text(),'WELL Certification')]"));
		projectenrol.click();
		Thread.sleep(6000);
		
		Driver.manage().window().maximize();
		WebElement startprojectv = Driver.findElement(By.xpath("//button[contains(text(),'Start a v2 Project')]"));
		startprojectv.click();
		

		Thread.sleep(4000);

		WebElement continueproject = Driver.findElement(By.xpath("//button[contains(text(),'Continue' )]"));
	/*	Actions actions = new Actions(Driver);
		actions.moveToElement(Driver.findElement(By.xpath("//button[contains(text(),'Continue' )]"))).perform();
*/
		continueproject.click();
		
		Thread.sleep(4000);
		
		WebElement continueproject2 = Driver.findElement(By.id("formulate--projects-v2-create-95"));
		continueproject2.sendKeys("Divijbuilding");
		WebElement continueproject3 = Driver.findElement(By.id("formulate--projects-v2-create-96"));
		continueproject3.click();
		
	}

}

/*Dimension d = new Dimension(300,650);
Driver01.manage().window().setSize();

red line at setSize*/