package Selenuim2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muharrem Ustun\\IdeaProjects\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        driver.manage().window().maximize();



        Select days = new Select(driver.findElement(By.id("select-demo")));
        System.out.println("Multiple selection of days: " + days.isMultiple());


        Select states = new Select(driver.findElement(By.id("multi-select")));
        System.out.println("Multiple selection of states: " + states.isMultiple());

//        driver.close();
    }


}
