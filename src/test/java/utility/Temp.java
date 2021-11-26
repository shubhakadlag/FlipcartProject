package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp
{
	public static void main(String[]args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software testing\\Automation Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//openapp
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//click on cancle
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		//Thread.sleep(5000);
		//navigate on login page
		Actions act=new Actions(driver);
		WebElement a=driver.findElement(By.xpath("//*[@class='_28p97w']"));
		act.moveToElement(a).build().perform();
		//Thread.sleep(5000);
		//click on my profile
	 driver.findElement(By.xpath("//*[text()='My Profile']")).click();
	 driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]")).sendKeys("kadlagshubhangi@gmail.com"); // enter username
	 driver.findElement(By.xpath("//*[@type='password']")).sendKeys("12shubha"); //enter password
	 driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click(); //click on login  
	 
	 driver.findElement(By.xpath("//*[text()='Manage Addresses']")).click();  //click on manage address
	 
	 driver.findElement(By.xpath("//*[@class='_1QhEVk']")).click(); //click on new address
	 
	 driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Shubhangi Tungar"); //name
	 
	 driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9767496018");
	 
	 driver.findElement(By.xpath("//*[@name='pincode']")).sendKeys("422003"); //pincode
	 
	 driver.findElement(By.xpath("//*[@name='addressLine2']")).sendKeys("Panchavati");
	 
	 driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("Damodar nagar,Hirawadi Road ,Panchavati"); //address
	 
	 driver.findElement(By.xpath("(//*[@class='_1XFPmK'])[1]")).click();
	 
	 driver.findElement(By.xpath("//*[@tabindex='10']")).click();
	}
}
