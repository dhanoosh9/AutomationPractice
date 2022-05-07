package pages;

import org.openqa.selenium.By;

import stepDefinations.BaseClass;

public class SauceDemoLoginPage extends BaseClass{
	
	static By username = By.xpath("//input[@placeholder='Username']");
	static By password = By.xpath("//input[@placeholder='Password']");
	static By login = By.xpath("//input[@name='login-button']");
	
	public static void user(String user, String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
	}
	
	public static void login() {
		driver.findElement(login).click();
	}
}
