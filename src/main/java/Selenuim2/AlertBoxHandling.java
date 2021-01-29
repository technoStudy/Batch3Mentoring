package Selenuim2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muharrem Ustun\\IdeaProjects\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize();

        /*
        Alert box, Confirm box, and Prompt box.
         */

//        driver.findElement(By.cssSelector("button[onclick=\"myAlertFunction()\"]")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();
//
//
//        driver.findElement(By.cssSelector("button[onclick=\"myConfirmFunction()\"]")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        Thread.sleep(3000);
//        driver.switchTo().alert().dismiss();

        driver.findElement(By.cssSelector("button[onclick=\"myPromptFunction()\"]")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Muharrem");
        Thread.sleep(6000);
        driver.switchTo().alert().dismiss();

        driver.quit();
    }
}
