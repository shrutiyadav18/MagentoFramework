package magentoPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterCustomerPage extends BasePage {
	public RegisterCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By createAccount = By.xpath("//a[text()=\"Create an Account\"]");
	private By firstname = By.id("firstname");
	private By lastname = By.id("lastname");
	private By emailAddress = By.id("email_address");
	private By password = By.id("password");
	private By confirmPassword = By.id("password-confirmation");
	private By createAccountBtn = By.xpath("//button[contains(@title,'Create an Account')]");

	public void clickOnCreateAccount() {
		driver.findElement(createAccount).click();
	}

	public void fillPersonalDetails(String fname, String lname, String email, String pwd, String confirmPwd) {
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(emailAddress).sendKeys(email);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(confirmPassword).sendKeys(confirmPwd);
	}

	public void clickOnRigister() {
		driver.findElement(createAccountBtn).click();
	}
}
