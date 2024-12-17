package magentoPageObject;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String isUserOnHomePage() {
		try {
			return driver.getTitle();
		} catch (Exception e) {
			return "Error in displaying message";
		}
	}

}
