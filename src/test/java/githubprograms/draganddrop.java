package githubprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// open application
		driver.get("https://jqueryui.com/droppable/");
		// maximize the window
		driver.manage().window().maximize();
		// switchto iframe edi ivvakapothey error vasthadi
		driver.switchTo().frame(0);
		// drag and drop
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();

	}

}
