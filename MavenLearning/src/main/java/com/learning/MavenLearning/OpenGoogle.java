package com.learning.MavenLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(htmlReporter);
		ExtentTest test = extentReports.createTest("Verifying Google");
		System.setProperty("webdriver.chrome.driver", "E:\\\\Automation\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		test.log(Status.INFO,"Navigating to Google");
		driver.get("http://www.google.co.in");
		test.pass("Passed");
		driver.quit();
		extentReports.flush();

	}

}
