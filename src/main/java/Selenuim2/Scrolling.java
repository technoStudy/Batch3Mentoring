package Selenuim2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class Scrolling {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muharrem Ustun\\IdeaProjects\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

// scrolling up and down
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        driver.get("https://techno.study/");
        driver.manage().window().maximize();
//        jse.executeScript( "scroll(0,1000);");
//        jse.executeScript( "scroll(0,-1000);");

//        jse.executeScript("window.scrollBy(0,1000)","");
//        jse.executeScript("window.scrollBy(0,-1000)","");

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);


// scrolling till the end of the page
        // 1st way: by using JavascriptExecutor
//        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        // 2nd way: by using sendKeys method
//        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

        // 3rd way: by using Robot class
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_END);
//        robot.keyPress(35);
//        robot.keyRelease(17);
//        robot.keyRelease(35);


//        scrolling to an element
        WebElement myElement = driver.findElement(By.xpath("//h1[text()=\"why TECHNOSTUDY?\"]"));
        jse.executeScript("arguments[0].scrollIntoView();", myElement);

    }
}
