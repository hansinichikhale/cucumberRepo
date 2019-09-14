package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.frmwrk.util.ObjectMap;

public class GmailLoginPage extends LoginPage {
	ObjectMap objMap = new ObjectMap("ObjectRepository.properties");
	
	public void enterMail(WebDriver driver,String UserIdvlue) {
		WebElement element = null;
		try {
			element = driver.findElement(objMap.getLocator("GmailUserid"));
			EnterData(driver,element,"GmailUserID",UserIdvlue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	 public void navigateToGmail(WebDriver driver, String ApplicationValue) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","G:/chromedriver.exe");
	        driver = new ChromeDriver();
	        Thread.sleep(4000);
	    	//driver = new FirefoxDriver();
			driver.manage().window().maximize();
	        driver.get(ApplicationValue);
	    	System.out.println("gmail is opend");

}
	 public void ClickNextButton(WebDriver driver) {
		 WebElement element = null;
			try {
				element = driver.findElement(objMap.getLocator("GmailNextButton"));
				clickElement(driver, "NextButton", element);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
}
	 public void enterPassword(WebDriver driver, String Password) {
		 WebElement element = null;
			try {
				element = driver.findElement(objMap.getLocator("GmailPassword"));
				EnterData(driver,element,"GmailPassword",Password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}