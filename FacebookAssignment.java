package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

public class FacebookAssignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.tagName("title")).getText());

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kiruthika");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gogulnath");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kiruthika@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Gogulnath@123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select fbday = new Select(day);
		fbday.selectByValue("23");

		WebElement month = driver.findElement(By.id("month"));
		Select fbmonth = new Select(month);
		fbmonth.selectByVisibleText("May");

		WebElement year = driver.findElement(By.id("year"));
		Select fbyear = new Select(year);
		fbyear.selectByIndex(29);

		driver.findElement(By.xpath("//input[@value='1']")).click();

	}
}