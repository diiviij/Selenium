package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

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

		Driver.manage().window().fullscreen();
		
		/*WebElement login2 =Driver.findElement(By.xpath("//h2[@class='mt-2 text-2xl lg:text-3xl leading-7 text-coolGray-700']"));
		login2.click();*/
		
		/*String currenturlis = Driver.getTitle();
		System.out.print(currenturlis);*/
		
		/*java.io.File srcScreenshot = Driver.findElement(By.name("search")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcScreenshot,new File(System.getProperties()+"\\screenshot.png"));
		*/
		
		/*Thread.sleep(4000);
		Driver.close();*/
		
		WebElement projectenrol = Driver.findElement(By.xpath("//a[contains(text(),'WELL Certification')]"));
		projectenrol.click();
		Thread.sleep(6000);
		
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("//div[@data-type='select']//select[@placeholder='']")).click();
		
		WebElement dropdown = Driver.findElement(By.xpath("//div[@data-type='select']//select[@placeholder='']"));
		Select Select1 = new Select(dropdown);
		Select1.selectByValue("India");
		/*WebElement startprojectv = Driver.findElement(By.xpath("//button[contains(text(),'Start a v2 Project')]"));
		startprojectv.click();*/
		

		/*Thread.sleep(4000);
		WebElement projectenrol2 = Driver.findElement(By.tagName("h1"));
		projectenrol2.click();
		Driver.findElement(By.tagName("h1")).sendKeys(Keys.SPACE);

		WebElement continueproject = Driver.findElement(By.xpath("//button[contains(text(),'Continue' )]"));/*
		/*Actions actions = new Actions(Driver);
		actions.moveToElement(Driver.findElement(By.xpath("//button[contains(text(),'Continue' )]"))).perform();*/

		/*continueproject.click();*/
		
		/*WebElement continueproject2 = Driver.findElement(By.id("formulate--projects-v2-create-95"));
		continueproject2.sendKeys("Divijbuilding");
		WebElement continueproject3 = Driver.findElement(By.id("formulate--projects-v2-create-96"));
		continueproject3.click();*/
	/*	WebElement dropdownField = driver.findElement(By.id("drop1"));
        Select select1 = new Select(dropdownField);
        
         select1.selectByIndex(1);
       
        WebElement multiselectionBoxField = driver.findElement(By.id("multiselect1"));
        Select select2 = new Select(multiselectionBoxField);
        
         select2.selectByIndex(0);
         */
		
		/*WebElement dropdownField = driver.findElement(By.id("drop1"));
        Select select = new Select(dropdownField);
        
        List<WebElement> options = select.getOptions();
        
         for(WebElement option : options) {
               
               System.out.println(option.getText());
               */
		
		Thread.sleep(4000);
		Driver.close();
		
		
	}

}

/*Dimension d = new Dimension(300,650);
Driver01.manage().window().setSize();

red line at setSize*/