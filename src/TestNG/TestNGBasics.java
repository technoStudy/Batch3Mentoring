package TestNG;
/*
- TestNG is a testing framework inspired from JUnit,
  but introducing some new functionalities that make it more powerful and easier to use.

- TestNG is an open source automated testing framework; where NG means NextGeneration.

- TestNG is similar to JUnit (especially JUnit 4), but it is not a JUnit extension.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
TestNG Features:

- Simplifies the way tests are coded
- Supports annotations.It does not require a main method
- Supports testing integrated classes (e.g., by default, no need to create a new test class instance for every test method).
- Uncaught exceptions are automatically handled
- Parameterization is possible
- Introduces ‘test groups’.
- Supports Dependent test methods,
- parallel testing,
- load testing,
- partial failure is possible
- reporting is easier and more beautiful
 */
/*
TestNG vs JUnit

TestNG can parameterize, group the tests easier, enables parallel testing, has DataProvider, provides HTML reports
 */
public class TestNGBasics {

    @Test
    public void test1(){

        String actual = "This is a string but....";
        Assert.assertEquals("This is a string.", actual);

    }

    @Test
    public void test2(){

        String actual = "This is a string but....";
        Assert.assertTrue("This is a string.".equals(actual));

    }

}
