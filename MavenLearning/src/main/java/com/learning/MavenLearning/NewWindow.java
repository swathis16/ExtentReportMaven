package com.learning.MavenLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.browserstack.com/guide/selenium-4-features#toc8");

	}

}
