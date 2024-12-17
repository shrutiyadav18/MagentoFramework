package steps;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magentoPageObject.BasePage;
import magentoPageObject.HomePage;
import magentoPageObject.LoginPage;
import magentoPageObject.RegisterCustomerPage;

public class magentoStepdef {
	WebDriver driver;
	RegisterCustomerPage registerPage;
	LoginPage loginPage;
	BasePage basePage;
	HomePage homePage;

	@Before
	public void setup() throws IOException {
		driver = BaseClass.initilizeBrowser();
		basePage = new BasePage(driver); // Initialize BasePage with WebDriver
		registerPage = new RegisterCustomerPage(driver);
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
	}

	@After
	public void tearDown(Scenario scenario) {
		if (driver != null) {
			driver.quit();
		}
	}

	@Given("the user navigates to create Account page")
	public void theUserNavigatesToCreateAccountPage() {
		try {
			registerPage.clickOnCreateAccount();
		} catch (Exception e) {
			System.out.println("Error occurred while signing up: " + e.getMessage());
		}
		System.out.println("Account Created");
	}

	@When("the user enters the {string} {string} {string} {string} {string} into  fields")
	public void theUserEntersTheIntoFields(String fname, String lname, String email, String pwd, String confirmPwd) { //
		registerPage.fillPersonalDetails(fname, lname, email, pwd, confirmPwd);
		System.out.println("Fill all details");
	}

	@Then("the user account should get created successfully")
	public void theUserAccountShouldGetCreatedSuccessfully() {
		registerPage.clickOnRigister();
		System.out.println("Register successfully");
	}

	@Given("I am on the login page")
	public void iAmOnTheLoginPage() {
		loginPage.navigateToLoginPage();
	}

	@When("I enter valid login credentials {string} {string}")
	public void iEnterValidLoginCredentials(String email, String pwd) {
		loginPage.enterCredentials(email, pwd);
		loginPage.submitLoginForm();
	}

	@Then("I should be logged in and redirected to My Account Page")
	public void iShouldBeLoggedInAndRedirectedToMy() {
		String titleOfPage = homePage.isUserOnHomePage();
		System.out.println("Title of page: " + titleOfPage);
	}

	@Given("I am on the sign page")
	public void IAmOnTheSignPage() {
		loginPage.navigateToLoginPage();
	}

	@When("I enter invalid login credentials {string} {string}")
	public void iEnterInvalidLoginCredentials(String email, String pwd) {
		loginPage.enterCredentials(email, pwd);
		loginPage.submitLoginForm();
	}

	@Then("I should see an error message {string}")
	public void iShouldSeeAnErrorMessage(String errorMessage) {
		String message = loginPage.isErrorMessageDisplayed(errorMessage);
		System.out.println("Error Message: " + message);
	}

}
