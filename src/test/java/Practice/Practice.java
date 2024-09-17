package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver Driver = null;
			String Browser="Chrome";
			if(Browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				Driver=new ChromeDriver();
			}
			Driver.manage().window().maximize();
			Driver.get("https://test-nuxt.wellcertified.com");
			WebElement email=Driver.findElement(By.xpath("//input[@type='email']"));
			email.sendKeys("nandhakumaaran.s@sys-core.com");
			WebElement pass=Driver.findElement(By.xpath("//input[@type='password']"));
			pass.sendKeys("Init@2024");
			Thread.sleep(2000);
			WebElement signin=Driver.findElement(By.xpath("//button[@type='submit']"));
			signin.click();
			Thread.sleep(15000);
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
			Thread.sleep(1000);
			Driver.quit();
	}

}
