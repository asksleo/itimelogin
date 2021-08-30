package Itime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class itimelogin {
	 @Test
	  public void f() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
		  WebDriver hcl = new ChromeDriver();
		  hcl.get("https://myhcl.com/");
		  WebDriverWait var1= new WebDriverWait(hcl,10);
		  var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
		  hcl.findElement(By.xpath("//*[@id='i0116']")).sendKeys("karan.kumar@hcl.com");
		  hcl.findElement(By.id("idSIButton9")).click();
		  var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
		  hcl.findElement(By.id("i0118")).sendKeys("@Narak1234567");
		  var1.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
		  hcl.findElement(By.id("idSIButton9")).click();
		  WebDriverWait var2= new WebDriverWait(hcl,20);
		  var2.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
		  hcl.findElement(By.id("idSIButton9")).click();
		  hcl.findElement(By.id("txtSearch")).sendKeys("itime");
		  WebElement search= hcl.findElement(By.id("txtSearch"));
		  hcl.quit();
		        
		  
	  }
	}

