package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select dd = new Select(dropdown1);
		dd.selectByIndex(2);
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select dd1 = new Select(dropdown2);
		dd1.selectByVisibleText("Selenium");
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select dd2 = new Select(dropdown3);
		dd2.selectByValue("3");
		System.out.println("The getTest -  " + driver.findElement(By.className("dropdown")).getText());
		driver.findElement(By.xpath("(//div[@class='example']//select)[5]")).sendKeys("Loadrunner");
		driver.findElement(By.xpath("(//div[@class='example']//select)[6]")).sendKeys("Selenium");

	}

}
