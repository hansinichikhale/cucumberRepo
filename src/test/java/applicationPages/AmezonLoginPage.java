package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.frmwrk.util.ObjectMap;

public class AmezonLoginPage extends LoginPage {

	ObjectMap objMap = new ObjectMap("ObjectRepository.properties");
	
	public void enterMail(WebDriver driver,String UserIdvlue) {
		WebElement element = null;
		try {
			element = driver.findElement(objMap.getLocator("Amezonuserid"));
			EnterData(driver,element,"UserId",UserIdvlue);
			element = driver.findElement(objMap.getLocator("btnAmContinue"));
			clickElement(driver,"continue",element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	public void enterPasword(WebDriver driver,String pwd) {
		WebElement element = null;
		try {
			element = driver.findElement(objMap.getLocator("Amezonpwd"));
			EnterData(driver,element,"password",pwd);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	public void clickLogin(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(objMap.getLocator("btnAmLogin"));
			clickElement(driver,"btnAmLogin",element);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void clickSignIn(WebDriver driver) {
			WebElement element = null;
			try {
				element = driver.findElement(objMap.getLocator("btnSigIn"));
				clickElement(driver,"btnSigIn",element);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		        
	}
		public void SucessMessage(WebDriver driver) {
			WebElement element = null;
			try {
				element = driver.findElement(objMap.getLocator("btnSucessMessage"));
				clickElement(driver,"btnSucessMessage",element);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		        
	}
}
