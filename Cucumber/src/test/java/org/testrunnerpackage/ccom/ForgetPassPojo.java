package org.testrunnerpackage.ccom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassPojo extends BaseClass {
	public ForgetPassPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement linkForgetPassword;
	@FindBy(id = "identify_email")
	private WebElement enterMobileNumber;
	@FindBy(id = "did_submit")
	private WebElement btnSearch;
	

	public WebElement getLinkForgetPassword() {
		return linkForgetPassword;
	}

	public WebElement getEnterMobileNumber() {
		return enterMobileNumber;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	

}
