package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AmazonsignupLanding {
	
	
	public WebDriver dr;
	/*@Before
	public void setupofdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\git\\Guru99Project1_TestNG\\Drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().driverVersion("97.0.4692.71").setup();;
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@After
	public void teardown() {
		dr.quit();
	}*/
	@Given("user is on amazon home page")
	public void user_is_on_amazon_home_page() throws InterruptedException {
		
		dr.get("https://www.amazon.in/");
		Thread.sleep(10000);
	}

	@When("the user clicks on addcart button")
	public void the_user_clicks_on_addcart_button() {
	    dr.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
	}

	@Then("user should be navigated to signuplanding page")
	public void user_should_be_navigated_to_signuplanding_page() {
	    boolean flag=dr.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div[2]/div[1]/h2")).isDisplayed();
	    Assert.assertTrue(flag);
	}

	@Then("the users should be able to click on the signup button")
	public void the_users_should_be_able_to_click_on_the_signup_button() {
	    dr.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]/span")).click();
	}

	@Then("the user should be able to see the sign up page")
	public void the_user_should_be_able_to_see_the_sign_up_page() {
	  boolean flag=dr.findElement(By.id("auth-continue")).isDisplayed();
	  Assert.assertTrue(flag);
	 
	}

}
