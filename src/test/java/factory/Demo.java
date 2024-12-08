package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "qwe233@gmail.com";
		String pwd = "Test1@123";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); By
		 * firstname = By.id("firstname");
		 * driver.findElement(By.xpath("//a[text()=\"Create an Account\"]")).click();
		 * wait.until(ExpectedConditions.presenceOfElementLocated(firstname));
		 * driver.findElement(firstname).sendKeys("Test1FN");
		 * driver.findElement(By.id("lastname")).sendKeys("Test1LN");
		 * driver.findElement(By.id("email_address")).sendKeys(email);
		 * driver.findElement(By.id("password")).sendKeys(pwd);
		 * driver.findElement(By.id("password-confirmation")).sendKeys("Test1@123");
		 * driver.findElement(By.xpath("//button[contains(@title,'Create an Account')]")
		 * ).click();
		 */
		driver.findElement(By.xpath("(//div[@class='panel header']//a[contains(text(),'Sign In')])")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("send2")).click();
		System.out.println("Login successfully");
		driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
		driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")).click();
		System.out.println("Logoff successfully");
		driver.findElement(By.xpath("(//div[@class='panel header']//a[contains(text(),'Sign In')])")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("send2")).click();
		System.out.println("Login successfully");

	}
}
