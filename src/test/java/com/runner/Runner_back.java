package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\feature",glue="com\\stepdef",plugin = {"html:Report/HtmlReport.html"})
public class Runner_back {

	
public static WebDriver runnerdriver;
	
	public static WebDriver set_up() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\10Decoders\\eclipse-workspace\\Background\\driver\\chromedriver.exe");
	return runnerdriver = new ChromeDriver();
	
	}
	@AfterClass
	public static void teardown() {
		runnerdriver.close();
	}

}
