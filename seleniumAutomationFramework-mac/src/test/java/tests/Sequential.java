package tests;

import org.testng.annotations.Test;

import com.configData_Util.STATUS;
import com.customReporting.CustomReporter;

import or.common.LoginPage;

public class Sequential {

	@Test(priority = 1, description = "1 + Test - S")
	public void Test1_S() {
		System.out.println("1 + Test - S");
		
		CustomReporter.report(STATUS.PASS, "TEST STEP");
		
		LoginPage log = new LoginPage();
		
		log.performLogin("ST");
	}
	
	@Test(priority = 2, description = "2 + Test - S",dependsOnMethods={"Test1_S"})
	public void Test2_S() {
		System.out.println("2 + Test - S");
		CustomReporter.report(STATUS.FAIL, "TEST STEP");

		LoginPage log = new LoginPage();
		
		log.performLogin("ST");
	}



}
