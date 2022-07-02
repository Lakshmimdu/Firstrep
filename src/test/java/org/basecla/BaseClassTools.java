package org.basecla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassTools {
	public static WebDriver driver;

	public static void browserOpen(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\BaseClass\\exefie\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\exefile\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
	}

	public static void launch(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static WebElement findElementByxpath(String name) {
		return driver.findElement(By.xpath(name));
	}

	public static WebElement findElementById(String name) {
		return driver.findElement(By.id(name));
	}

	public static WebElement findElementByLinkText(String text) {
		return driver.findElement(By.linkText(text));
	}

	public static void sendKey(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void dropDownSelectAValue(String value, WebElement element) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void click(WebElement element) {

		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

}
