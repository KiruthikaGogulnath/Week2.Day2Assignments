package week2.day2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;


public class LeafGroundLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("(//ul[@class='wp-categories-list']//a)[3]")).click();
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/a)[3]")).getAttribute("href"));
		int j = 0;
		List<WebElement> LinkName = driver.findElements(By.xpath("//div[@class='large-6 small-12 columns']/a"));
		for (int i = 0; i < LinkName.size(); i++) {
			System.out.println(LinkName.get(i).getAttribute("href"));
			j = i;
		}

		System.out.println("Total no link is " + j);

		driver.navigate().back();
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/a)[3]")).getAttribute("href");

	}

}
