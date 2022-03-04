package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Duplicate@leaf.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement elementDuplicatelead = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a)[1]"));
		String text= elementDuplicatelead.getText(); 
		System.out.println(text); 
		elementDuplicatelead.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement checkname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String name= checkname.getText(); 
		System.out.println(name); 
		if(name.equals(text))
		{
			System.out.println("The Record is Duplicated");
			
		}
		else {
			 System.out.println("The Record is not Duplicated");
		 } 
		driver.close();

		
	}

}
