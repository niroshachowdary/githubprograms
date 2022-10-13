package githubprograms;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class asserts {
@Test
public void verify() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@type='submit']")).click();

WebElement loginbutton = driver.findElement(By.xpath("//h5"));
/*
 * if (loginbutton.isDisplayed()) {
 * System.out.println("PASS---login button is dispalyed"); 
 * }else {
 * System.out.println("FALL--------login button is not displayed");
 *  }
 */
//or if conditions 4 lines unatai anduke assersts use chesthey one line anduke asserts use chestharu
// edi one value ni verify cheyadaniki  2 ni verify cheyadaniki assertions programs


Assert.assertTrue(loginbutton.isDisplayed());


}
}
