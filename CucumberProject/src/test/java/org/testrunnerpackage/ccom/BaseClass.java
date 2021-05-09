package org.testrunnerpackage.ccom;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void closeBrowser() {
		driver.quit();
	}
	public static void applyWaits() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
	public static void fill(WebElement element,String text) {
		element.sendKeys(text);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void takeSnap(String fileName) throws IOException {
			TakesScreenshot t=(TakesScreenshot)driver;
			File src=t.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\sasikumar\\eclipse-workspace\\CucumberProject\\Screenshots\\"+fileName+".png");
			FileUtils.copyFile(src, des);
	}
}
