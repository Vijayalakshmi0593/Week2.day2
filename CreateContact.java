package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Vijayalakshmi");

		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Viji");

		driver.findElement(By.id("lastNameField")).sendKeys("P");

		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("P");

		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Financial Operations");

		driver.findElement(By.id("createContactForm_description")).sendKeys("Banking and financial operation");

		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("viji0593@gmail.com");

		WebElement elestate = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));

		Select dropdown = new Select(elestate);

		dropdown.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.linkText("Edit")).click();

		driver.findElement(By.id("updateContactForm_description")).clear();

		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Payroll function");

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		String title = driver.getTitle();

		System.out.println(title);

	}

}
