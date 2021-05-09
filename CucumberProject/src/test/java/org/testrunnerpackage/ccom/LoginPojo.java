package org.testrunnerpackage.ccom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{

	public LoginPojo(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtUsername;
	@FindBy(id="pass")
	private WebElement txtPassword;
	@FindBy(name="login")
	private WebElement btnClick;
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}
	
	
	
}
