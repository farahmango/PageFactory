package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

	WebDriver driver ; 
	@FindBy(xpath = "//input[@id='email']") WebElement email ;
	@FindBy(xpath = "//input[@id='pass']") WebElement pass ;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button") WebElement login ;

	
	
	public FacebookPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginToFacebook(String Email , String Pass) throws InterruptedException {
		Thread.sleep(5000);
		email.sendKeys(Email);
		pass.sendKeys(Pass);
		login.click();
	}
}
