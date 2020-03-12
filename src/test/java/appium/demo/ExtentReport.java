package appium.demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;


	@BeforeSuite
	public void ReporySetUp() {

		htmlreporter = new ExtentHtmlReporter("C:\\Users\\User\\eclipse-workspace\\demo\\report.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
	}

	@AfterSuite
	public void ReportTearDown() {

		extent.flush();

	}


}
