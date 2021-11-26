package cucumberMap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.HTMLReportGenerator;

public class Hookable 
{
 
	@Before
	public void beforeMethod(Scenario scenario) throws Throwable
	{
		HTMLReportGenerator.TestSuiteStart("D:\\testreport\\flipcart.html", "Flipcartproject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		
		System.out.println("------------------Scenario Start------------------");
	}
	
	@After
	public void afterMethod(Scenario scenario)
	{
		System.out.println("------------------Scenario End------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
		
	}
	
	
	
	
	
	
}
