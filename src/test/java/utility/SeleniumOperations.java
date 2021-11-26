package utility;

import java.time.Duration;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	//browserLounch
	public static Hashtable<String,Object> browserLounch(Object[]inputParameters)
	{
		try {
		String strBrowserName=(String) inputParameters[0];
		String strExe=(String) inputParameters[1];
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", strExe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}else if(strBrowserName.equalsIgnoreCase("FireFox"))
		{

			System.setProperty("webdriver.gecko.driver", strExe);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodName:browserLounch, Input_Data : " + inputParameters[1].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodName:browserLounch, Input_Data : " + inputParameters[1].toString());
		}
		return outputParameters;
		
	}
	//openApp
			public static Hashtable<String,Object> openApplication(Object[]inputParameters)
			{
				try {
				String strUrl=(String) inputParameters[0];
				driver.get(strUrl);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodName: openApplication, Input_Data : " + inputParameters[0].toString());
				
				}catch(Exception e)
				{
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodName: openApplication, Input_Data : " + inputParameters[0].toString());
				}
				return outputParameters;
			}
	// click On element
			public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
			{
				try {
				String xpath=(String) inputParameters[0];
				driver.findElement(By.xpath(xpath)).click();;
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodName:clickOnElement, Input_Data : " + inputParameters[0].toString());
			}catch(Exception e)
				{

				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodName:clickOnElement, Input_Data : " + inputParameters[0].toString());
			}
				return outputParameters;
			}
	//moveToElement
			public static Hashtable<String,Object> moveToElement(Object[]inputParameters)
			{
				try {
				String xpath=(String) inputParameters[0];
				Actions act=new Actions(driver);
				WebElement element=driver.findElement(By.xpath(xpath));
				act.moveToElement(element).build().perform();
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodName:moveToElement, Input_Data : " + inputParameters[0].toString());
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				}catch(Exception e)
				{
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodName:moveToElement, Input_Data : " + inputParameters[0].toString());
			}
				return outputParameters;
			}
	//sendkeys
			public static Hashtable<String,Object> sendKeys(Object[]inputParameters) 
			{
				try {
				String xpath=(String) inputParameters[0];
				String strValue=(String) inputParameters[1];
				driver.findElement(By.xpath(xpath)).sendKeys(strValue);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodName:sendKeys, Input_Data : " + inputParameters[1].toString());
				
			}catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodName:sendKeys, Input_Data : " + inputParameters[1].toString());
				
			}
				return outputParameters;
	
	
	
			}
			//validate Login
			public static Hashtable<String,Object> validationLogin(Object[]inputParameters)
			{
				try {
				String textName=(String) inputParameters[0];
				String xpath=(String) inputParameters[1];
				
				String name=driver.findElement(By.xpath(xpath)).getText();
				if(textName.equalsIgnoreCase(name))
				{
					System.out.println("Test Case Pass");
				}else
				{
					System.out.println("Test Case Fail");
				}
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodName:validationLogin, Input_Data : " + inputParameters[0].toString());
				}catch(Exception e)
				{
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodName:validationLogin, Input_Data : " + inputParameters[0].toString());
				}
				return outputParameters;
			}
}
