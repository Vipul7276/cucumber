package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefination {
WebDriver driver;


	@Given("^User Is Already on Login Page$")
	public void user_Is_Already_on_Login_Page() {
		System.setProperty("webdrive.chrome.drive","F:\\eclipse-jee-neon-3-win32-x86_64\\SELENIUM\\cucumberFramworkBDD\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///F:/selenium/Offline%20Website/index.html");
}

	
	
	@When("^Tital Of Login Page$")
	public void tital_Of_Login_Page() {
		String title = driver.getTitle();
		System.out.println("title");
		Assert.assertEquals("JavaByKiran | Log in", title);
	}

	
	
	
	
	@Then("^User Enters UserName and User Enter Password$")
	public void User_Enters_UserName_and_User_Enter_Password() {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	
	}

	@And("^click the log in button$")
	public void click_the_log_in_button() {
		driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
		
		/*
		  WebElement
		  web=driver.findElement("//*[@id='form']/div[3]/div/button");// other
		  method to find click button JavascriptExecutor
		  jse=(JavascriptExecutor)driver;
		  jse.executeScript("arguments[0].click();", web);
		 */
	}

	@Then("^User Is On Home Page$")
	public void User_Is_On_Home_Page() {
		
		String title = driver.getTitle();
		System.out.println("Home Page Title::" + title);
	    Assert.assertEquals("JavaByKiran | Dashboard", title);
	}

	

}
