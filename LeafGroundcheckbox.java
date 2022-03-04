package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;


public class LeafGroundcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='example']//input)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[4]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).click();
		boolean sel = driver.findElement(By.xpath("(//div[@class='example']//input)[6]")).isSelected();
		System.out.println("Confirm whether selenium is checked :" + sel);
		driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[9]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[10]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[11]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[12]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[13]")).click();
	}

}
