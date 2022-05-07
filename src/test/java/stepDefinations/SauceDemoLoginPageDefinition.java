package stepDefinations;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SauceDemoLoginPage;

public class SauceDemoLoginPageDefinition extends BaseClass{
	
	@Given("The homepage of saucedemo site")
	public void the_homepage_of_saucedemo_site() {
		String exp_title = "Swag Labs";
		assertEquals(driver.getTitle(), exp_title);
	}

	@Then("Enter the username standard_user and password secret_sauce(.+),(.+)")
	public void enter_the_username_standard_user_and_password_secret_sauce(String username, String password) {
		SauceDemoLoginPage.user(username, password);
	}

	@Then("Click on login button")
	public void click_on_login_button() {
		SauceDemoLoginPage.login();
	}
	
}
