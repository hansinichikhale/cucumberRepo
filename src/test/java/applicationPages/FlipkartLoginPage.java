package applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.frmwrk.util.ObjectMap;

public class FlipkartLoginPage extends LoginPage {
	ObjectMap objMap = new ObjectMap("ObjectRepository.properties");
	public WebDriver driver;
	
	public FlipkartLoginPage(RemoteWebDriver driver1) {

this.driver = driver1;
		
	}
	public void enterFlipkartId(String UserIdvlue) {
		WebElement element = null;
		try {
			//element=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
			element = driver.findElement(objMap.getLocator("FlipkartUserid"));
			EnterData(driver,element,"FlipkartUserID",UserIdvlue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	public void navigateToFlipkart(String ApplicationValue) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","G:/chromedriver.exe");
	        driver = new ChromeDriver();
	        Thread.sleep(4000);
	    	//driver = new FirefoxDriver();
			driver.manage().window().maximize();
	        driver.get(ApplicationValue);
	    	System.out.println("Flipkart is opened");
	}
	public void enterPassword(String Password) {
		 WebElement element = null;
			try {
				element = driver.findElement(objMap.getLocator("FlipkartPassword"));
				EnterData(driver,element,"FlipkartPassword",Password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	 public void clickLoginSign () throws NullPointerException {
		 WebElement element = null;
			try {
				element = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
				//element = driver.findElement(objMap.getLocator("LoginSign"));
				clickElement(driver, "LoginSign", element);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 public void clickLogin () {
		 WebElement element = null;
			try {
				element = driver.findElement(objMap.getLocator("BtnLogin"));
				clickElement(driver, "BtnLogin", element);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 public void enterProductName( String Product) {
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
	 public void clickProductSearch () {
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
