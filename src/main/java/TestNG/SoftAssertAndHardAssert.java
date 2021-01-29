package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertAndHardAssert {

    @Test
    public void softTest() {
        boolean isGreen = false;
        boolean hasAppeared = false;
        String message = "City deleted";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(isGreen, "The message box was not green!");
        softAssert.assertTrue(hasAppeared, "The message box has not appeared");
        softAssert.assertEquals(message, "City deleted", "It does not show the correct message");
        softAssert.assertAll();

    }
}
