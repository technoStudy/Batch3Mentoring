package WaitsInSelenium;
/*
Implicit Wait:
  - It applies to all web elements. Once the condition happens, the implicit wait will not
  wait for the rest of the time, it will continue.
  - It is stated only once, you do not state implicit wait again for the rest of the method. It applies to ALL elements.
    That is why implicit wait is good if the conditions for all elements are uniform.

Explicit Wait:
  - It does not apply to all elements. You have to (explicitly) state to wait for which elements under what conditions.
    Once the condition happens, it will not wait for the rest of the time and continue (just like implicit wait)
  - You need to write extra lines of codes in order to state the condition for each element. But this makes it very flexible.
    Explicit wait is good to use where different conditions apply for different web elements.

Note: - Do not use both in the same method/piece of code. It is bad practice. (Can you imagine why?)
      - Thread.sleep() is not an option or alternative. It is not a type of wait in Selenium anyway. Thread.sleep() waits
        EXACTLY for the said time, no matter what. That is to say it wastes time. Furthermore, you need to handle the exception.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muharrem Ustun\\IdeaProjects\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,4);

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement addRemoveButton = driver.findElement(By.cssSelector("form#checkbox-example>button"));
        for (int i = 0; i < 4; i++) {
            addRemoveButton.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
            String message = driver.findElement(By.id("message")).getText();
            System.out.println(message);
        }


        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        WebElement enableDisableButton = driver.findElement(By.cssSelector("form#input-example>button"));
        for (int i = 0; i < 4; i++) {
            enableDisableButton.click();
            wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
            String message = driver.findElement(By.id("message")).getText();
            System.out.println(message);
        }

        driver.quit();
    }

}
