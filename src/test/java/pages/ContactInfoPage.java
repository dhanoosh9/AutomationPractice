package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import stepDefinations.BaseClass;

public class ContactInfoPage extends BaseClass {
	
	
	public ContactInfoPage(WebDriver driver) {
		ContactInfoPage.driver = driver; 
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
		
	}
	
	@FindBy(xpath="//a[contains(@title,'Contact Us')]")
	WebElement Contactus;
	
	@FindBy(xpath="//input[contains(@id,'email')]")
	WebElement Email;
	
	@FindBy(xpath="//input[contains(@id,'id_order')]")
	WebElement Order_reference;
	
	@FindBy(xpath="//textarea[contains(@id,'message')]")
	WebElement Message;
	
	@FindBy(xpath="//span[contains(.,'Send')]")
	WebElement Send_btn;
	
	public void contactus() {
		Contactus.click();
	}
	
	public void email(String email_id) {
		Email.sendKeys(email_id);
	}
	
	public void order_reference(String reference) {
		Order_reference.sendKeys(reference);
	}
	
	public void message(String msg) {
		Message.sendKeys(msg);
	}
	
	public void send() {
		Send_btn.click();
	}
}
