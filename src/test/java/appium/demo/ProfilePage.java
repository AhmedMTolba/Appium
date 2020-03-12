package appium.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfilePage extends TestBase {

	
public ProfilePage(AndroidDriver<MobileElement> element) {
		
		PageFactory.initElements(new AppiumFieldDecorator(element), this);
	}

@AndroidFindBy(id = "com.experitest.ExperiBank:id/makePaymentButton")
AndroidElement MakePay;

@AndroidFindBy(id = "com.experitest.ExperiBank:id/nameTextField")
AndroidElement NameElement;

@AndroidFindBy(id = "com.experitest.ExperiBank:id/phoneTextField")
AndroidElement PhonelElement;

@AndroidFindBy(id = "com.experitest.ExperiBank:id/amount")
AndroidElement AmountElement;

@AndroidFindBy(id = "com.experitest.ExperiBank:id/countryTextField")
AndroidElement CountryElement;

@AndroidFindBy(id = "com.experitest.ExperiBank:id/sendPaymentButton")
AndroidElement SendElement;

@AndroidFindBy(id ="android:id/button1")
AndroidElement AcceptElement;

@AndroidFindBy(className = "android.view.View")
AndroidElement FtextElement;

public void MakePayment() {
	
	MakePay.click();
}
public void FillPay(String phoneNum,String na) {
	PhonelElement.sendKeys(phoneNum);
	NameElement.sendKeys(na);
}
public void Slider(){
  
       // AmountElement.sendKeys(Keys.ARROW_RIGHT);
   AmountElement.click();
}


public void CompleteFor(String Country) {

	CountryElement.sendKeys(Country);
	
	SendElement.click();
}
public boolean Accept() {
	AcceptElement.click();
	return FtextElement.isDisplayed();
}

}
