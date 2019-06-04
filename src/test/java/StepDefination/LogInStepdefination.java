package StepDefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LogInStepdefination {
	
	WebDriver driver;
	
	@Given("^user is on loginPage$")
	public void user_is_on_loginPage() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Sel jar\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.costco.com/");
		driver.findElement(By.xpath("//*[@id=\"postal-code-continue\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header_sign_in\"]")).click();
	
	}

	@When("^user filled login details to the login fields$")
	public void user_filled_login_details_to_the_login_fields() throws Throwable {
	    
		driver.findElement(By.xpath("//*[@id=\"logonId\"]")).sendKeys("manoj89088@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"logonPassword\"]")).sendKeys("@Babamama143");
		
	}

	@Then("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"LogonForm\"]/fieldset/div[5]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"link-membership-interrupt\"]/div[2]/div/div/div/div[2]/input")).click();
	    
	}

	@Then("^verify the homepage$")
	public void verify_the_homepage() throws Throwable {
		
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals("Welcome to Costco Wholesale", Title);
	}

}
