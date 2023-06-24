package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

	WebDriver driver;
	@FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea") WebElement search ; 
	@FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]") WebElement button ; 
	@FindBy(xpath = "//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]") WebElement facebookBath ; 
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/a") WebElement engWebsite ; 

	
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void goToFacebook(String val) throws InterruptedException {
		Thread.sleep(5000);
		(engWebsite).click();
		(search).sendKeys(val);
		(button).click();
		Thread.sleep(5000);
		(facebookBath).click();
		
	}

	
	
}
