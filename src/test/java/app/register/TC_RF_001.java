package app.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC_RF_001 {

    public static void main(String[] arg){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo");
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("Tom");
        driver.findElement(By.id("input-lastname")).sendKeys("Jack");
        driver.findElement(By.id("input-email")).sendKeys("tom@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("963639633");
        driver.findElement(By.id("input-password")).sendKeys("tom@123");
        driver.findElement(By.id("input-confirm")).sendKeys("tom@123");
        driver.findElement(By.id("agree")).click();
        //driver.findElement(By.xpath("//input[@value='Continue']")).submit();





    }
}
