package steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	WebDriver driver;
	@Before
	public void setUP()
	{
		System.out.println("In Before hook Method");
	}
	@Given("user starts {string} browser")
	public void user_starts_browser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
	}

	@Given("user launch using url {string}")
	public void user_launch_using_url(String url) {
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("user enters text {string} in textbox using xpath {string}")
	public void user_enters_text_in_textbox_using_xpath(String text, String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	   
	}

	@When("user clicks button using xpath {string}")
	public void user_clicks_button_using_xpath(String xpath ) {
	   driver.findElement(By.xpath(xpath)).click();
	}

	@Then("user verifies title to be {string}")
	public void user_verifies_title_to_be(String expTitle) {
	    Assert.assertEquals(expTitle, driver.getTitle());
	}
	@When("user clicks link using xpath {string}")
	public void user_clicks_link_using_xpath(String xpath) {
	    driver.findElement(By.xpath(xpath)).click();
	}
	@When("user enters details in registration form")
	public void user_enters_details_in_registration_form(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	  List<List<String>> allList=dataTable.asLists();//list of list here
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(allList.get(0).get(0));
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(allList.get(0).get(1));
	  driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(allList.get(0).get(2));
	  driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(allList.get(0).get(3));
	  driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(allList.get(0).get(4));
	  driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(allList.get(0).get(5));
	 
	  
	  
	  
	}
	@When("user enters details in registration form2")
	public void user_enters_details_in_registration_form2(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>>  listOfMaps=dataTable.asMaps();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys( listOfMaps.get(0).get("username"));
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys (listOfMaps.get(0).get("password"));
		  driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys( listOfMaps.get(0).get("confirmpassword"));
		  driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys( listOfMaps.get(0).get("fullname"));
		  driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys( listOfMaps.get(0).get("email"));
		  driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys( listOfMaps.get(0).get("captcha"));
	}



	@AfterStep
	public void ss()
	{
		System.out.println("Screenshot Taken");
	}
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
