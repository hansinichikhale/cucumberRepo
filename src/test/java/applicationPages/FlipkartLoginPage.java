package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.frmwrk.util.ObjectMap;

public class FlipkartLoginPage extends LoginPage {
	ObjectMap objMap = new ObjectMap("ObjectRepository.properties");
	
	public void enterFlipkartId(WebDriver driver,String UserIdvlue) {
		WebElement element = null;
		try {
			element = driver.findElement(objMap.getLocator("FlipkartUserid"));
			EnterData(driver,element,"FlipkartUserID",UserIdvlue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	public void navigateToFlipkart(WebDriver driver, String ApplicationValue) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","G:/chromedriver.exe");
	        driver = new ChromeDriver();
	        Thread.sleep(4000);
	    	//driver = new FirefoxDriver();
			driver.manage().window().maximize();
	        driver.get(ApplicationValue);
	    	System.out.println("Flipkart is opened");
	}
	public void enterPassword(WebDriver driver, String Password) {
		 WebElement element = null;
			try {
				element = driver.findElement(objMap.getLocator("FlipkartPassword"));
				EnterData(driver,element,"FlipkartPassword",Password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	 public void clickLoginSign (WebDriver driver) throws NullPointerException {
		 WebElement element = null;
			try {
				element = driver.findElement(objMap.getLocator("LoginSign"));
				//clickElement(driver, "LoginSign", element);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 public void clickLogin (WebDriver driver) {
		 WebElement element = null;
			try {
				element = driver.findElement(objMap.getLocator("BtnLogin"));
				clickElement(driver, "BtnLogin", element);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 public void enterProductName(WebDriver driver, String Product) {
		 WebElement element = null;
			try {
				//element = driver.findElement(objMap.getLocator("EdtFilpkartPSerach"));
				element = driver.findElement(By.id("twotabsearchtextbox"));
				//JavascriptExecutor js=(JavascriptExecutor)driver;
				//js.executeScript("document.getElementById('twotabsearchtextbox').value=\"puma\"");
				EnterData(driver,element,"EdtFilpkartPSerach",Product);
				//js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	 public void clickProductSearch (WebDriver driver) {
		 WebElement element = null;
			try {
				element = driver.findElement(objMap.getLocator("btnFsearch"));
				clickElement(driver, "btnFsearch", element);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
}
