package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiruthika@gmail.com");
		WebElement webElement = driver.findElement(By.xpath("//input[@value='Append ']"));
		webElement.sendKeys("Kiruthika");
		webElement.sendKeys(Keys.TAB);
		webElement.sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value"));
		driver.findElement(By.xpath("(//div[@class='example']//input)[4]")).clear();
		boolean enabled = driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).isEnabled();
		if(enabled)
		{
			System.out.println("Text is enabled" + enabled);
		}
		else
		{
			System.out.println("Text is not enabled" + enabled);
		}
		   
	}

}
