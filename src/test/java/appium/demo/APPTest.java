package appium.demo;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.LogStatus;

public class APPTest extends TestBase {
	ExtentTest test;
	 LoginPage lopage;
	 ProfilePage propage;
	
	@Test
	public void JustLogin() {
		 test = extent.createTest("Test one", "this first test casee");
		test.log(Status.PASS, "Step details");
		
		lopage = new LoginPage(driver);
		lopage.login("company", "company");
		test.log(Status.PASS, "Suceess Login");
		propage = new ProfilePage(driver);
		propage.MakePayment();
		test.log(Status.PASS, "Payment Sucess");
		propage.FillPay("01094474847", "Ahmed Tolba");
		propage.Slider();
		propage.CompleteFor("Egypt");
		test.log(Status.PASS, "Success Completing form");
		
		Assert.assertEquals(propage. Accept(), true);	
		
	}
}
