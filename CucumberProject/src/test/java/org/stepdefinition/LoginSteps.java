package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testrunnerpackage.ccom.BaseClass;
import org.testrunnerpackage.ccom.ForgetPassPojo;
import org.testrunnerpackage.ccom.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {

	public LoginPojo l;
	public ForgetPassPojo f;

	@Given("user is in login page")
	public void user_is_in_login_page() {
		launchUrl("http://facebook.com/");
		applyWaits();
	}

	@When("user click login button")
	public void user_click_login_button() throws InterruptedException {
		btnClick(l.getBtnClick());
		Thread.sleep(3000);
	}

	@Then("user must be displayed with error messsage")
	public void user_must_be_displayed_with_error_messsage() {
		String url = driver.getCurrentUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("Invalid attempt");
			
		} else {
			try {
				WebElement accHome = driver.findElement(By.id("userAccountname"));
				Assert.assertTrue(accHome.isDisplayed());
			} catch (Exception e) {

			}
		}
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String email, String pass) throws InterruptedException {
		l = new LoginPojo();
		fill(l.getTxtUsername(), email);
		fill(l.getTxtPassword(), pass);

	}

	@When("user enter empty username and password")
	public void user_enter_empty_username_and_password() {
		l = new LoginPojo();
		fill(l.getTxtUsername(), "");
		fill(l.getTxtPassword(), "");
	}

	@Then("user must be displayed with error message")
	public void user_must_be_displayed_with_error_message() {
		WebElement errMsg = driver
				.findElement(By.xpath("//div[contains(text(),'The email address or mobile number you entered isn')]"));
		Assert.assertTrue(errMsg.isDisplayed());
		
	}

	@Given("user click forget password link")
	public void user_click_forget_password_link() {
		 f=new ForgetPassPojo();
		   btnClick(f.getLinkForgetPassword());
	}

	@When("user searches the account using incorrect mobile number")
	public void user_searches_the_account_using_incorrect_mobile_number() throws InterruptedException {
		fill(f.getEnterMobileNumber(), "9597309949");
		   btnClick(f.getBtnSearch());
		   Thread.sleep(8000);	}

	@Then("user must not displayed with any accounts")
	public void user_must_not_displayed_with_any_accounts() throws InterruptedException {
		WebElement errMsgFrgtPass = driver.findElement(By.xpath("//div[text()='No search results']"));
		Thread.sleep(5000);
		Assert.assertTrue(errMsgFrgtPass.isDisplayed());
	}
	
}
