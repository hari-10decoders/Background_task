package com.stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.runner.Runner_back;

import groovyjarjarantlr4.v4.codegen.model.Action;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	public static WebDriver driver = Runner_back.set_up();
	
	@Given(": User is click the Login field")
	public void user_is_click_the_login_field() {
		
		driver.get("https://letcode.in/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}
	@Given(": User Enter the email ID in Email ID Field")
	public void user_enter_the_email_id_in_email_id_field() {
		driver.findElement(By.name("email")).sendKeys("hphari84280@gmail.com");
	}
	@Given(": User Enter the password in Password Field")
	public void user_enter_the_password_in_password_field() {
		driver.findElement(By.name("password")).sendKeys("Vikkram@2023");
	}
	@Given(": User Hit the log in button")
	public void user_hit_the_log_in_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	}
	@Given(": User click the work_space field")
	public void user_click_the_work_space_field() {
		driver.findElement(By.xpath("//a[text()='Work-Space']")).click();
	}
	@Then(": User Click the Edit field in Input field")
	public void user_click_the_edit_field_in_input_field() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	@Given(":User Enter the FullName in Enter your full Name field")
	public void user_enter_the_full_name_in_enter_your_full_name_field() {
		driver.findElement(By.xpath("//a[text()='Work-Space']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("fullName")).sendKeys("Hariprasad");
	}
	@When(": User press the tab in keaboard")
	public void user_press_the_tab_in_keaboard() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		}
	@When(": User Get the text from What is inside the text box field")
	public void user_get_the_text_from_what_is_inside_the_text_box_field() {
		String attribute = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(attribute);
	}
	@Then(": User clear the existing text from Clear the text field")
	public void user_clear_the_existing_text_from_clear_the_text_field() {
		driver.findElement(By.id("clearMe")).clear();
	}



	

}
