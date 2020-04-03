package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {

public static WebDriver driver;
@Test
private static void openOutbackSite() {
	//System.out.println("Outback.com");
		driver.get("https://togo.outbackonlineordering.com");
		driver.manage().window().maximize();
	
	}
@BeforeClass
public void beforeClass() {
	
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
 driver=new ChromeDriver();
	 
}
@AfterClass
public void afterClass() {
driver.quit();
}
}
	


