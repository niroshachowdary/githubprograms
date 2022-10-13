package githubprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlewindow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.citi.com/credit-cards/compare/view-all-credit-cards");
		// step2 click on link careers
		driver.findElement(By.linkText("Careers")).click();
		// handle window
		Set<String> windownames = driver.getWindowHandles();
		System.out.println(windownames);
		// convert set as list
		List<String> allwindows = new ArrayList<String>(windownames);
		String mainwindowname = allwindows.get(0);
		String childwindowname = allwindows.get(1);
		// swtich to new window
		driver.switchTo().window(childwindowname);
		// step4 get url
		String careersgroupURL = driver.getCurrentUrl();
		System.out.println("careers group url:" + careersgroupURL);
		// step5 verify URL contains careers citigroup.com
		if (careersgroupURL.contains("careers.citigroup.com")) {
			System.out.println("PASS URL contains careers.citigroup.com");
		} else {
			System.out.println("FAIL URL doesnot contains careers.citigroup.com");
		}
		// step6 close child window
	//	driver.close();
		//driver.quit();
		// switch back to mainwindow
		driver.switchTo().window(mainwindowname);
		//driver.close();

	}

}
