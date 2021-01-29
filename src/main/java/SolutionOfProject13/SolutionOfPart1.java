package SolutionOfProject13;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SolutionOfPart1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muharrem Ustun\\IdeaProjects\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String  actualName = "Automation";
        String  actualEmail = "Testing@gmail.com";

//        1) Navigate to  http://demoqa.com/text-box
        driver.get("http://demoqa.com/text-box");

//        2) Maximize the window
        driver.manage().window().maximize();

//        3) Enter full name as "Automation"
        driver.findElement(By.id("userName")).sendKeys(actualName);

//        4) Enter Email as "Testing@gmail.com"
        driver.findElement(By.id("userEmail")).sendKeys(actualEmail);

//        5) Enter Current Address as "Testing Current Address"
        driver.findElement(By.id("currentAddress")).sendKeys("Testing Current Address");

//        6) Enter Permanent Address as "Testing Permanent Address"
        driver.findElement(By.id("permanentAddress")).sendKeys("Testing Permanent Address");

//        7) Click on submit button
        driver.findElement(By.id("submit")).click();

//        8) Print Name in the text box
        String expectedName = driver.findElement(By.id("name")).getText().substring(5);  //Name:Automation
        System.out.println(expectedName);

//        if(actualName.equals(expectedName)) {
//            System.out.println("Name test passed");
//        } else {
//            System.out.println("Name test failed");
//        }

//        9) Print Email in the text box
        String expectedEmail = driver.findElement(By.id("email")).getText().substring(6);  // Email:Testing@gmail.com
        System.out.println(expectedEmail);

//        if(actualEmail.equals(expectedEmail)) {
//            System.out.println("Email test passed");
//        } else {
//            System.out.println("Eamil test failed");
//        }


//        10) Print Current Address in the text box
String currentAddress = driver.findElement(By.cssSelector("p#currentAddress")).getText();



//        11) Print Permanent Address in the text box

    }


    @Test
    public void nameTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muharrem Ustun\\IdeaProjects\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String  actualName = "Automation";
        String  actualEmail = "Testing@gmail.com";
//        1) Navigate to  http://demoqa.com/text-box
        driver.get("http://demoqa.com/text-box");

//        2) Maximize the window
        driver.manage().window().maximize();

//        3) Enter full name as "Automation"
        driver.findElement(By.id("userName")).sendKeys(actualName);

//        4) Enter Email as "Testing@gmail.com"
        driver.findElement(By.id("userEmail")).sendKeys(actualEmail);

//        5) Enter Current Address as "Testing Current Address"
        driver.findElement(By.id("currentAddress")).sendKeys("Testing Current Address");

//        6) Enter Permanent Address as "Testing Permanent Address"
        driver.findElement(By.id("permanentAddress")).sendKeys("Testing Permanent Address");

//        7) Click on submit button
        driver.findElement(By.id("submit")).click();

//        8) Print Name in the text box
        String expectedName = driver.findElement(By.id("name")).getText().substring(5);  //Name:Automation
        System.out.println(expectedName);

        Assert.assertEquals(expectedName, actualName);
    }

}

