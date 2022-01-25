package stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSigninPage {
	
	public WebDriver dr=DriverFactory.getDriver();
	
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
	
	@Given("user is on amazon home page1")
	public void user_is_on_amazon_home_page() throws InterruptedException {
		
		Thread.sleep(5000);
		System.out.println(dr.getTitle());
	}

	@When("the user clicks on addcart button1")
	public void the_user_clicks_on_addcart_button() {
	    dr.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
	}

	@Then("user should be navigated to signuplanding page1")
	public void user_should_be_navigated_to_signuplanding_page() {
	    boolean flag=dr.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div[2]/div[1]/h2")).isDisplayed();
	    Assert.assertTrue(flag);
	}
	@Then("^the users should be able to enter (.*) and (.*) and click on sign in button$")
	public void  enter_credentials(String un,String pwd) throws InterruptedException{
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span")).click();
		dr.findElement(By.id("ap_email")).sendKeys(pwd);
		dr.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		
		
	}
	@Then("the users should be able to enter username and  click on sign in button")
	public void rundatatable(DataTable un) throws InterruptedException {
		Thread.sleep(5000);
		List<String> username=un.asList();
		dr.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span")).click();
		dr.findElement(By.id("ap_email")).sendKeys(username.get(0));
		dr.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	}
}
