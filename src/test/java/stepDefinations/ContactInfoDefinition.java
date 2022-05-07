package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ContactInfoPage;

public class ContactInfoDefinition extends BaseClass{
	
	@Before
	public void setup() {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	driver.get("http://automationpractice.com/index.php");
    	driver.manage().window().maximize();

	}
	
	@After
	public void tearDown() {
        driver.close();
        driver.quit();
	}
	
	ContactInfoPage contact;

	
	@Given("User clicked on the contact us button in homepage")
	public void user_clicked_on_the_contact_us_button_in_homepage() {
		contact = new ContactInfoPage(driver);
		contact.contactus();
	}

	@Then("contact us page is opened")
	public void contact_us_page_is_opened() {
		String exp_title = "Contact us - My Store";
		assertEquals(driver.getTitle(), exp_title);
	}

	@When("^user filled all the details (.+),(.+),(.+)$")
	public void user_filled_all_the_details(String email, String reference, String message) {
		contact = new ContactInfoPage(driver);
		contact.email(email);
		contact.order_reference(reference);
		contact.message(message);
	}

	@Then("clicked on the send button")
	public void clicked_on_the_send_button() {
		contact = new ContactInfoPage(driver);
		contact.send();
	}
	
}
