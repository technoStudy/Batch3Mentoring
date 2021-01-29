package TestNG;

import org.testng.annotations.*;

public class BasicAnnotations {


    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }

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

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class Basic Annotations");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class Basic Annotations");
    }
}
