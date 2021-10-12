package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[(text()='Create New Account')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vijayalakshmi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8807378202");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456@Sairam");

		// Dropdown option:

		WebElement eledate = driver.findElement(By.id("day"));

		Select dropdown = new Select(eledate);

		dropdown.selectByIndex(21);

		// Month:

		WebElement elemonth = driver.findElement(By.id("month"));

		Select dropdown1 = new Select(elemonth);

		dropdown1.selectByValue("5");

		// Year:

		
		WebElement eleyear = driver.findElement(By.id("year"));

		Select dropdown2 = new Select(eleyear);

		dropdown2.selectByVisibleText("1993");
		
		//Selecting radio button:
		
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		
		
	}

}
