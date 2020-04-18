package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PickupOrder {
  @Test
  public void pickupOrder() {
	  
	  	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");
	  	WebDriver driver=new ChromeDriver();
	  //Launch an URL in ChromeBrowser
	  	driver.get("https://qa-azure.outbackonlineordering.com");
	  //Set timeout interval
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //
	  	
	  	
	  	
	  	driver.findElement(By.xpath("//button[@id='btn-confirm']//span[@class='ng-binding']")).click();
	  	
	  	
	      driver.findElement(By.xpath("//a[@class='change-location ng-binding']")).click();        
	      driver.findElement(By.id("restaurant_search_single_field_search_text")).sendKeys("Palm Harbor,FL,USA");
	    	driver.findElement(By.xpath("//span[@class='ng-binding'][contains(text(),'Search')]")).click();
	    	driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[2]//button[1]//span[1]")).click();
	      driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click(); 		
	    
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	driver.findElement(By.xpath("//main[@class='outerContainer contentOuterContainer ng-scope']//li[2]//a[1]//span[1]")).click();
	  	driver.findElement(By.xpath("//li[@class='categoryItemListItem ng-scope pricedItem']//div[@class='actionsContainer categoryItemActionsContainer']//span[@class='ng-binding']")).click();
	      driver.findElement(By.xpath("//button[@name='addMenuItem']//span[@class='ng-binding']")).click();
	      driver.findElement(By.xpath("//div[@class='sidebarContent orderPathsContainerTop ng-scope']//span[@class='ng-binding']")).click();		
	      driver.findElement(By.xpath("//button[@class='payAtRestaurantAction chooseOrderPaymentPayAtRestaurantAction trk-checkoutpayatrestaurant ng-scope']//span[@class='ng-binding ng-scope']")).click();
	      
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.findElement(By.id("contact_info_first_name")).sendKeys("Harti");
	      driver.findElement(By.id("contact_info_last_name")).sendKeys("Tati");
	      driver.findElement(By.id("contact_info_email")).sendKeys("hartitati@mailinator.com");
	      driver.findElement(By.id("contact_info_phone")).sendKeys("8136828016");
	      
	      WebElement wb=driver.findElement(By.xpath("//select[@id='contact_info_car_color']"));
	      Select select=new Select(wb);
	    select.selectByVisibleText("Blue");
	    driver.findElement(By.xpath("//input[@id='contact_info_car_description']")).sendKeys("Honda CRV");
	    driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
	  }
	  /*public static void dropDownSelectByText(WebElement webElement, String VisibleText){
	  Select selObj=new Select(webElement);
	  selObj.selectByVisibleText(VisibleText);
	  } */
	  }
  

