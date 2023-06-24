package TestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FacebookPage;
import Pages.GoogleSearchPage;

public class TestCases {

	WebDriver driver = new EdgeDriver();
	GoogleSearchPage obj = new GoogleSearchPage(driver);
	FacebookPage obj2 = new FacebookPage(driver);

	@BeforeTest
	public void beforeTest() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}

	@Test
	public void A_test() throws InterruptedException {
		obj.goToFacebook("facebook");
		
	}
	
	
	@Test
	public void B_tetst() throws InterruptedException {
		obj2.loginToFacebook("farahmao@gmail.com", "pass1234");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
		
	}
	
	
	
}
