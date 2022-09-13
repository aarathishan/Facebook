package org.facebook.objectrepository;

import org.facebook.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage extends Commonactions{
	
	public FacebookPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
    private WebElement uname;
	
	@FindBy(id="pass")
    private WebElement pwd;
	
	@FindBy(name="login")
    private WebElement login;

	public WebElement getUname() {
			return uname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
