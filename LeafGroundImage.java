package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//img)[1]")).click();
		driver.findElement(By.xpath("(//ul[@class='wp-categories-list']//a)[4]")).click();
		System.out.println("The image is broken :"+driver.findElement(By.xpath("(//div[@class='row']//img)[2]")).isEnabled());
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//img)[3]")).click();
	}

}
