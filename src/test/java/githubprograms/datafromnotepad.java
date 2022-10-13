package githubprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datafromnotepad {
	@Test
	public void verifylogin() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// read data from url
		// finding location
		String path = "C:\\Users\\lenovo\\eclipse-workspace\\mavenpackage01\\src\\test\\resources\\commonmethods.properties";
//read url from notepad location
		FileInputStream file = new FileInputStream(path);

		Properties prop = new Properties();
//load url from notepad
		prop.load(file);
		// url stored in the projecturl
		String projecturl = prop.getProperty("appurl");
//open url or application
		driver.get(projecturl);

	}
}
