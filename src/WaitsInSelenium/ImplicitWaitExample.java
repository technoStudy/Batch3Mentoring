package WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muharrem Ustun\\IdeaProjects\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement addRemoveButton = driver.findElement(By.cssSelector("form#checkbox-example>button"));
        for (int i = 0; i < 4; i++) {
            addRemoveButton.click();
            String message = driver.findElement(By.id("message")).getText();
            System.out.println(message);
        }


        WebElement enableDisableButton = driver.findElement(By.cssSelector("form#input-example>button"));
        for (int i = 0; i < 4 ; i++) {
            enableDisableButton.click();
            String message = driver.findElement(By.id("message")).getText();
            System.out.println(message);
        }

        driver.quit();
    }

}
