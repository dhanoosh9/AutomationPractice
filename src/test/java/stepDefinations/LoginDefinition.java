package stepDefinations;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginDefinition extends BaseClass {
	
	
	
//	@Before(value="@SmokeTest",order=2)
//	public void setup2() {
//		System.out.println("in setup2");
//	}
	


    @Given("^The user is on hompage$")
    public void The_user_is_on_hompage() throws Throwable {
    	String exp_title = "My Store";
    	assertEquals(driver.getTitle(), exp_title);
    }
    
    @When("^user sign-in into application with username (.+) and password (.+)$")
    public void user_signin_into_application_with_username_and_password(String username, String password) throws Throwable {
    	driver.findElement(By.xpath("//a[@class='login'][contains(.,'Sign in')]")).click();
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
    	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(password);
    	driver.findElement(By.xpath("//span[contains(.,'Sign in')]")).click();
    }

    @Then("^profile page should  be opened$")
    public void profile_page_should_be_opened() throws Throwable {
    	String exptitle = "My account - My Store";
    	assertEquals(driver.getTitle(), exptitle);
    }

}
