package mymaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTesting {
@Test
public void Test1(){
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
String a = "https://the-internet.herokuapp.com/login";
driver.get(a);
	


}
}
