package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().back();
		
		System.out.println("The position is:"+driver.findElement(By.xpath("//button[@id='position']")).getLocation());
		System.out.println("The Color is :" +drive.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("The Size is :" +drive.findElement(By.id("size")).getSize());
	

		
	}

}
