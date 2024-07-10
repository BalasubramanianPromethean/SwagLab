package SwagLabs.SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassOne {
private static WebElement username;

public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com/v1/");
driver.findElement(By.id("user-name"));
WebElement username = driver.findElement(By.id("user-name"));
username.click();
username.sendKeys("standard_user");
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("secret_sauce",Keys.ENTER);
  driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1] ")).click();
  driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[2]   ")).click();
  
  
  

}

}
