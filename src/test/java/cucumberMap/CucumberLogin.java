package cucumberMap;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class CucumberLogin
{
	@Given ("^user open \"(.*)\" browser with exe \"(.*)\"$")
	public void bLounch(String bname,String exe)
	{
		//blounch
			Object[] input=new Object[2];
				input[0]=bname;
				input[1]=exe;
			    SeleniumOperations.browserLounch(input);
	}
	
	@Given ("^user enter url as \"(.*)\"$")
	public void openApp(String url)
	{
		Object[] input1=new Object[1];
		input1[0]=url;
	     SeleniumOperations.openApplication(input1);
	}
	
	@Given ("^user cancle initial Login window$")
	public void clickOnCancel()
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
        SeleniumOperations.clickOnElement(input2);
	}
	
	@Given ("^user move on Login button$")
	public void moveToLogin()
	{
		 Object[] input3=new Object[1];
	     input3[0]="//*[@class='_28p97w']";
	     SeleniumOperations.moveToElement(input3);
	}
	
	@When ("^user click on my profile$")
	public void clickOnMyProfile()
	{
		 Object[] input4=new Object[1];
	     input4[0]="//*[text()='My Profile']";
	     Hashtable<String,Object>  output4=SeleniumOperations.clickOnElement(input4);
	     HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on my profile$", output4.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as username$")
	public void userName(String uname)
	{
		Object[] input5=new Object[2];
		input5[0]="(//*[@autocomplete='off'])[2]";
		input5[1]=uname;
		 Hashtable<String,Object>  output5=SeleniumOperations.sendKeys(input5);
		 HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"(.*)\" as username$", output5.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as password$")
	public void passWord(String pword)
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]=pword;
		 Hashtable<String,Object>  output6=SeleniumOperations.sendKeys(input6);
		 HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"(.*)\" as password$", output6.get("MESSAGE").toString());
	}
	
	@When ("^user click on login button$")
	public void clickOnLogin()
	{
		Object[] input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		 Hashtable<String,Object>  output7=SeleniumOperations.clickOnElement(input7);
		 HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on login button$", output7.get("MESSAGE").toString());
	}
	
	@Then ("^Application shows profile to user$")
	public void validateLogin()
	{
		 Object[] input8=new Object[2];
			input8[0]="Shubhangi Tungar";
			input8[1]="//*[text()='Shubhangi Tungar']";
			 Hashtable<String,Object>  output8= SeleniumOperations.validationLogin(input8);
			 HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows profile to user$", output8.get("MESSAGE").toString());
	}
	
	
	
	
	
	
}
