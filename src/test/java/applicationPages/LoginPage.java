package applicationPages;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.frmwrk.util.ApplicationUtility;
import com.frmwrk.util.ObjectMap;

import java.util.concurrent.TimeUnit;


import org.junit.Assert;
public class LoginPage extends ApplicationUtility {
	
	ObjectMap objMap = new ObjectMap("ObjectRepository.properties");
	ApplicationUtility objScreen= new ApplicationUtility();
public void enterUserIDPassword(WebDriver driver,String UserIdvlue,String Passwordvalue) {
	WebElement element = null;
	try {
		element = driver.findElement(objMap.getLocator("userid"));
		EnterData(driver,element,"UserId",UserIdvlue);
		element = driver.findElement(objMap.getLocator("password"));
		EnterData(driver,element,"password",Passwordvalue);
		element = driver.findElement(objMap.getLocator("btnSubmit"));
		clickElement(driver,"Submit",element);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
}
public void clickElement(WebDriver d,String ObjName,WebElement e) {
	waitElement(d,e);
	if(e.isDisplayed())	{
		objScreen.capture(d, ObjName);
		e.click();
		System.out.println(" displayed and clicked :"+ObjName);
	}
		else {
			System.out.println(ObjName+" is not displayed");	
	}
}
public void clickLink(WebDriver driver,String ObjName) {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	List<WebElement> EleList = driver.findElements(By.xpath("//*[text()='"+ObjName+"']"));
	for (int i=0; i<EleList.size();i++){
		waitElement(driver,EleList.get(i));
		if(EleList.get(i).isDisplayed())	{
			objScreen.capture(driver, ObjName);
			js.executeScript("arguments[0].click();", EleList.get(i));
			System.out.println(" displayed and clicked :"+ObjName);
		
	    }
	
	}
		
}
public void EnterData(WebDriver d,WebElement e,String ObjName,String Data) {
	waitElement(d,e);
	if(e.isDisplayed())	{
		e.sendKeys(Data);
		System.out.println("object displayed<<"+ObjName+"  and data<<"+Data+" is entered");
	}
		else {
			System.out.println(ObjName+" is not displayed");	
	}
	
}
public void SelectData(WebElement e) {

}

public void waitElement(WebDriver d,WebElement e) {
	
	
	try {
		WebDriverWait wait1 = new WebDriverWait(d,8000);
		wait1.wait(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}

