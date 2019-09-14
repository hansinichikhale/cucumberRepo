package com.frmwrk.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.frmwrk.util.GlobalVariables;

public class ApplicationUtility {
	public static String capture(WebDriver d,String screenshotName) {
		TakesScreenshot ts=(TakesScreenshot)d;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		String dest=GlobalVariables.ScreenShotFolderName+"//"+screenshotName+".png";
		File destination=new File(dest);
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dest;
	}

	
}
