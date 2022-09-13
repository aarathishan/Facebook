package org.facebook.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.facebook.objectrepository.FacebookPage;
import org.facebook.resources.Commonactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook extends Commonactions{
	
	public static WebDriver driver;
	Commonactions c=new Commonactions();
	FacebookPage f=new FacebookPage();
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		
		c.launch();
		System.out.println("welcome");
	}
	@When("user enter username and password")
	public void user_enter_username_and_password() throws InterruptedException {
		
		f.getUname().sendKeys("aarathi.kalai@gmail.com");
		Thread.sleep(3000);
		f.getPwd().sendKeys("pass123");
	
		/*WebDriverWait w=new WebDriverWait(driver,50);
		w.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys("aarathi.kalai@gmail.com");
		WebElement pwd=driver.findElement(By.id("pass"));
        pwd.sendKeys("pass123");*/
	}

	/*@When("User enter username and password")
	public void user_enter_and() {
		System.out.println("hi");
		//f.getUname().isDisplayed();
		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys("aarathi.kalai@gmail.com");
		//c.insertKeys(f.getUname(),"aarathi.kalai@gmail.com");
		//f.getPwd();
        WebElement pwd=driver.findElement(By.id("pass"));
        pwd.sendKeys("anithajoshni");
		//c.insertKeys(f.getPwd(),"anithajoshni");
	    
	}*/

	@When("click on login button")
	public void click_on_login_button() {
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		//c.clickElement(f.getLogin());
	    
	}

	@Then("User navigate to the home page")
	public void user_navigate_to_the_home_page() {
	    
	}
	
	/*@Given("User launch the browser")
	public void user_launch_the_browser() {
		
	   c.launch(); 
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String uname, String pwd) {
		
		driver.findElement(By.id("email")).sendKeys(uname);
		//c.insertKeys(f.getUname(),uname);
        driver.findElement(By.id("pass")).sendKeys(pwd);
		//c.insertKeys(f.getPwd(),pwd);
        	    
	}

	@When("click on login button")
	public void click_on_login_button() {
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		//c.clickElement(f.getLogin());
	}

	@Then("User navigate to the home page")
	public void user_navigate_to_the_home_page() {
	    
	}*/

}
