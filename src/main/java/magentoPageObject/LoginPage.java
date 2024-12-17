package magentoPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By clickOnSignIn = By.xpath("(//div[@class='panel header']//a[contains(text(),'Sign In')])");
	private By emailField = By.id("email");
	private By passwordField = By.id("pass");
	private By loginButton = By.id("send2");
	private By errorMessage = By.xpath("//div[@class='message-error error message']");

	public void navigateToLoginPage() {
		driver.findElement(clickOnSignIn).click();
	}

	public void enterCredentials(String email, String password) {
		WebElement emailElement = driver.findElement(emailField);
		WebElement passwordElement = driver.findElement(passwordField);
		emailElement.clear();
		emailElement.sendKeys(email);
		passwordElement.clear();
		passwordElement.sendKeys(password);
	}

	public void submitLoginForm() {
		driver.findElement(loginButton).click();
	}

	public String isErrorMessageDisplayed(String expectedMessage) {
		try {
			WebElement errorElement = driver.findElement(errorMessage);
			return errorElement.getText();
		} catch (Exception e) {
			return "Error in displaying message";
		}
	}
}