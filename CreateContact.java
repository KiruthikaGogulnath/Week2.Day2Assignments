package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		System.out.println("Automation testing started");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[@href='/crmsfa/control/contactsMain']")).click();
		driver.findElement(By.xpath("//ul/li/a[@href='/crmsfa/control/createContactForm']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kiruthika");
		driver.findElement(By.id("lastNameField")).sendKeys("Gogulnath");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kiruthika");
		driver.findElement(By.name("departmentName")).sendKeys("Developement");
		driver.findElement(By.name("description")).sendKeys("Selenium assignments");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kiruthika@gmail.com");
		WebElement elementDropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(elementDropDown);
		dropdown.selectByVisibleText("Florida");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']/table/tbody/tr/td/input[@value='Create Contact']")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Important note by kiruthika");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("The title is: " + driver.getTitle());

	}
}
