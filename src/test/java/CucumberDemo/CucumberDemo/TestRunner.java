package CucumberDemo.CucumberDemo;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import application.utility.ExcelUtility;
@RunWith(Cucumber.class)

@CucumberOptions(
		
        features ="src/test/java/javafeature/Abc.feature"
        ,glue= {"seleniumgluecode"},
        tags= {"@Flipkart"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
        monochrome = true
                )  //glue= {"seleniumgluecode"}  @LOGout,@Amit,@GmailLoginTestcase,@AmezonLogin src/test/java/javafeature/Amezon.feature ,src/test/java/javafeature/Amezon.feature
public class TestRunner {
    @AfterClass
    
    public static void writeExtentReport() {
       // Reporter.loadXMLConfig(new File("config/report.xml"));
  
    
    }
}




/*import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;*/

/*@CucumberOptions(
        features = "src/test/java/javafeature/Amezon.feature",
        glue = {"seleniumgluecode"},
        tags = {"@AmezonLogin"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"},
                plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
                monochrome = true       
  )
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}
*/






