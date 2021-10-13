package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Vijayalakshmi");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("P");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("viji0593@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("SBI card");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("8807378202");

		// Dropdown:

		WebElement elejob = driver.findElement(By.name("UserTitle"));

		Select dropdown = new Select(elejob);

		dropdown.selectByIndex(8);

		WebElement eleemployees = driver.findElement(By.name("CompanyEmployees"));

		Select dropdown1 = new Select(eleemployees);

		dropdown1.selectByIndex(4);

		WebElement elecountry = driver.findElement(By.name("CompanyCountry"));

		Select dropdown2 = new Select(elecountry);

		dropdown2.selectByVisibleText("India");

		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

		driver.close();

	}

}
