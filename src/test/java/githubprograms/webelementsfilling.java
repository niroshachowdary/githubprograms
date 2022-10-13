package githubprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelementsfilling {
	public static void main(String[] args) {
		// call driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// open browser
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
		// step2:submit the form
		// handle textbox
		driver.findElement(By.name("Name")).sendKeys("computer");
		// handle chexkbox
		driver.findElement(By.name("subscribe")).click();// unselect
		driver.findElement(By.name("subscribe")).click();// select
		// enter comment in textbox
		driver.findElement(By.name("comments")).sendKeys("comments");
		// dropdown
		Select country = new Select(driver.findElement(By.name("countries")));
		country.selectByVisibleText("Albania");
		// handle listbox
		Select brands = new Select(driver.findElement(By.name("computerbrands")));
		brands.deselectByVisibleText("DELL");
		brands.selectByVisibleText("IBM");
		brands.selectByVisibleText("HP");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@value='excellent']")).click();
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
	   driver.close();
		//driver.quit();
	}
}
