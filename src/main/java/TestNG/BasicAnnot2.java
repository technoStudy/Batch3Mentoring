package TestNG;

import org.testng.annotations.*;

public class BasicAnnot2 {

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }

}
