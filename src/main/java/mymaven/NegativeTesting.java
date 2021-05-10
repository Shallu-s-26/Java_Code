package mymaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NegativeTesting {
@Test
   public void Testingsites(){
	   System.setProperty("webdriver.chrome.driver.", "Driver/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   String site = "https://the-internet.herokuapp.com/login";
	   driver.get(site);
	   driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1] ")).sendKeys("tomsmith");
   driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("SuperSecretPasword!");
   driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/button[1]/i[1]")).click();
   }



}

