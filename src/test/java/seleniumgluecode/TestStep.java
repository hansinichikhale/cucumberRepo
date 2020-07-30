package seleniumgluecode;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import applicationPages.AmezonLoginPage;
import applicationPages.FlipkartLoginPage;
import applicationPages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestStep {
    public static WebDriver driver;
    
    @Before
    public void before(Scenario scenario) {
        System.out.println("------------------------------");
        System.out.println("Starting - " + scenario.getSourceTagNames());
        System.out.println("------------------------------");
        Date date = new Date();
        String strDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate= dateFormat.format(date);
        System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
        DateFormat dateFormat2 = new SimpleDateFormat(strDateFormat);
        String formattedDate2= dateFormat2.format(date);
        System.out.println("Current format " + formattedDate2);
        formattedDate2=formattedDate2.replace(":", "");
        formattedDate2=formattedDate2.substring(0, 6);
        System.out.println("Current format " + formattedDate2);
        String DateFolderpath=System.getProperty("user.dir")+"\\Screenshot\\"+formattedDate;
        
        Collection<String> TestName= scenario.getSourceTagNames();
        String TagName=TestName.toString();
        TagName=TagName.replace("[@", "");
        TagName=TagName.replace("]", "");
        String Tagpath=DateFolderpath+"\\"+TagName+"_"+formattedDate2;
        System.out.println(Tagpath);
        com.frmwrk.util.GlobalVariables.ScreenShotFolderName=Tagpath;
        File files = new File(Tagpath);
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Screenshot_Folder is created");
            } else {
                System.out.println("Failed to create multiple directories!");
            }
        }
      
    }
    
    @Given("^user is  on homepage$")
    public void user_is_on_homepage() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","G:/chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(4000);
    	//driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }
    
    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
        driver.findElement(By.linkText("Sign in")).click();
    }
    
    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
    	LoginPage Bpage = new LoginPage();
    	Bpage.enterUserIDPassword(driver, "blog.cucumber@gmail.com", "Cucumber@blog");
    }
    
    
    @Given("^user is able open amezon$")
    public void user_is_able_open_amezon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/windows/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        Thread.sleep(4000);
    	//driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
      
    }

    @When("^user navigates to amezon website$")
    public void user_navigates_to_amezon_website() throws Throwable {
    	System.out.println(driver.getTitle());
    }

    @When("^user click on cart button$")
    public void user_click_on_cart_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.id("nav-cart")).click();
    }

    @Then("^sucessfully cart page disaplyed$")
    public void sucessfully_cart_page_disaplyed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Thread.sleep(2000);
    	System.out.println(driver.getTitle());
    	driver.close(); 
    }


    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
    	AmezonLoginPage AZpage = new AmezonLoginPage();
    	AZpage.SucessMessage(driver);
    	//driver.close();
       // driver.quit();  
    } 
    @When("^user click sign button$")
    public void user_click_sign_button() throws Throwable {
    	AmezonLoginPage AZpage = new AmezonLoginPage();
    	AZpage.clickSignIn(driver);
    }
    @When("^user enter email$")
    public void user_enter_email() throws Throwable {
    	AmezonLoginPage AZpage = new AmezonLoginPage();
    	AZpage.enterMail(driver, "9527117498");

    }

    @When("^user enter password$")
    public void user_enter_password() throws Throwable{ 
    	AmezonLoginPage AZpage = new AmezonLoginPage();
    	AZpage.enterPasword(driver, "Xam@2015");
    }

    @When("^userclick on login button$")
    public void userclick_on_login_button() throws Throwable {
    	AmezonLoginPage AZpage = new AmezonLoginPage();
    	AZpage.clickLogin(driver);
    }
    @Given("^Hansini should open  Amezon website$")
    public void hansini_should_open_Amezon_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Hansini should click on sign in button$")
    public void hansini_should_click_on_sign_in_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Hansini enter email$")
    public void hansini_enter_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Hansini enter password$")
    public void hansini_enter_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Hansini clicks  on login button$")
    public void hansini_clicks_on_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Given("^user should be able to open flipkart website \"([^\"]*)\"$")
    public void user_should_be_able_to_open_flipkart_website(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        FlipkartLoginPage F=new FlipkartLoginPage();
        F.navigateToFlipkart(driver, arg1);
    }

    @Given("^user should click on login & signup  button$")
    public void user_should_click_on_login_signup_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	FlipkartLoginPage F=new FlipkartLoginPage();
    	//F.clickLoginSign(driver);
    }

    @Given("^user should enter mobile number \"([^\"]*)\"$")
    public void user_should_enter_mobile_number(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	FlipkartLoginPage F=new FlipkartLoginPage();
    	F.enterFlipkartId(driver, arg1);
    }

    @Given("^user should click on login button$")
    public void user_should_click_on_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	FlipkartLoginPage F=new FlipkartLoginPage();
    	F.clickLogin(driver);
    }

    @Given("^user should click on men tab$")
    public void user_should_click_on_men_tab() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
    }

    @Given("^user should click on clothing tab$")
    public void user_should_click_on_clothing_tab() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Given("^user should click on t-shirts tab button$")
    public void user_should_click_on_t_shirts_tab_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^successfully display the page$")
    public void successfully_display_the_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }
    @Given("^user should enter flipkart password \"([^\"]*)\"$")
    public void user_should_enter_flipkart_password(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	FlipkartLoginPage F=new FlipkartLoginPage();
    	F.enterPassword(driver, arg1);
    }
    @Given("^user should enter \"([^\"]*)\" in searchbox\\.$")
    public void user_should_enter_in_searchbox(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	FlipkartLoginPage F=new FlipkartLoginPage();
    	F.enterProductName(driver, arg1);
    }
    @Given("^user should click on search button\\.$")
    public void user_should_click_on_search_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	FlipkartLoginPage F=new FlipkartLoginPage();
    	F.clickProductSearch(driver);
    }

    @Then("^user should able to view products\\.$")
    public void user_should_able_to_view_products() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Product displayed");
        driver.close();
    }


}