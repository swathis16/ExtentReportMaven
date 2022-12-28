package com.learning.MavenLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		// Opens a new tab in existing window
		driver.switchTo().newWindow(WindowType.TAB);

		// Opens Browserstack homepage in the newly opened tab
		driver.navigate().to("https://www.browserstack.com/");

	}

}
