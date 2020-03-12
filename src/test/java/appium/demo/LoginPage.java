package appium.demo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends TestBase {
	
	
	public LoginPage(AndroidDriver<MobileElement> element) {
		
		PageFactory.initElements(new AppiumFieldDecorator(element), this);
	}
	
	@AndroidFindBy(id = "com.experitest.ExperiBank:id/usernameTextField")
     AndroidElement nameElement;
	
    @AndroidFindBy(id = "com.experitest.ExperiBank:id/passwordTextField")
     AndroidElement passwordElement;
    
    @AndroidFindBy(id = "com.experitest.ExperiBank:id/loginButton")
    AndroidElement loginElement;
    
    public void login (String na, String pass) {
    	nameElement.sendKeys(na);
        passwordElement.sendKeys(pass);
        loginElement.click();
        
    }


}
