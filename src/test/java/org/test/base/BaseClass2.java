package org.test.base;


import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {
	
	public static WebDriver driver;
	private static WebElement e;
	private static String i;
	private static String value;
	
	public static WebDriver lauchBrowser(String[] args) {
		return driver;
		
	}
	//browser
	public static WebDriver chromeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	return driver;
		
	}
	public static WebDriver firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		return driver;
	
	}
	public static WebDriver edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		return driver;
 }
//url launch
	public static void urllaunch(String url) {
		driver.get(url);
	}
	
	//maximize
	public static void maximize() {
	driver.manage().window().maximize();

	}
		
//implicity
	public static void implicitwait(long secs) {
	driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);

	}
	//sendkeys
	public static void SendKeys(WebElement e,String value) {
		e.sendKeys(value);

	}
	public static void click(WebElement e) {
		e.click();

	}
	
    
   public static  String currentUrl() {
	String currentUrl1 = driver.getCurrentUrl();
	return currentUrl1;

}

public static String title() {
	String title = driver.getTitle();
	return title;

}
public static void quit() {
driver.quit();
}
public static String getAttribute(WebElement e) {
String att = e.getAttribute("value");
return att;
}
public static void moveToElement() {
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
}
public static void selectByIndex(WebElement string, int i) {
	Select s=new Select(string);
	s.selectByIndex(i);

}
public static String Alert() {
	org.openqa.selenium.Alert a = driver.switchTo().alert();
	String t=a.getText();
	return t;
}
public static void selectByValue(WebElement e, String value) {
	Select s=new Select(e);
	s.selectByValue(value);
	
}
public static void selectByvisibleText() {
	Select s = new Select(e);
	s.deselectByVisibleText(value);
}
public static void getoptions(WebElement e) {
	Select s =new Select(e);
	s.getOptions();
}
public static void getAllOptions(WebElement e, String value) {
	Select s=new Select(e);
	s.getAllSelectedOptions();
}
public static void getfirstselectoption(WebElement e,String value) {
Select s=new Select(e);
s.getFirstSelectedOption();

}
public static void ismultiple(WebElement e) {
	Select s=new Select(e);
	s.isMultiple();
}
//private void Screenshot() {
//	TakesScreenshot t=(TakesScreenshot)driver;
//	File src= t.getScreenshotAs(OutputType.FILE);
//	File des=new File(value);

}



