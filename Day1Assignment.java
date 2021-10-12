package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Assignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// Step 1: Locate element:

		WebElement eleUsername = driver.findElement(By.id("username"));

		// Step 2: To type a value in a text field:
		eleUsername.sendKeys("Demosalesmanager");

		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SBIC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijayalakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");		
		
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Public Relations");			
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vijayalakshmi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MRS");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Financial Operations");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("550000");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("General Services");
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Public Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("21670");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Customersupport and Financial operations");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Payment services");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Demo Marketing Compaign");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/22/93");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
		driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("USD - American Dollar");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Yes");
		
		// Enter all the text fields in contact information:
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("9103");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("viji05932@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8807378202");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Vijayalakshmi");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.sbicard.com");
		
		
		//Enter all the text fields in primary address:
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Vijayalakshmi");
		driver.findElement(By.name("generalAddress1")).sendKeys("No.3/8, Raghava nagar 1st street");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600091");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Vijayalakshmi");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Madipakkam koot road");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		
		//Create Lead:
		driver.findElement(By.name("submitButton")).click();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
