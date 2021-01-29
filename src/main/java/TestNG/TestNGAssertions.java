package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
TestNG vs JUnit --> https://www.guru99.com/junit-vs-testng.html
*/
/*
Some TestNG Assert Methods:

assertEquals, assertNotEquals,
assertTrue,
assertFalse,
assertNull, assertNotNull,
assertSame, assertNotSame,
assertArrayEquals
fail
assertThrows
SoftAssert
 */
public class TestNGAssertions {
//    String word1 = new String("TechnoStudy");
////    String word2 = "Techno".concat("Study");
//    String word3 = new String("TechnoStudy");

//    @Test
//    public void test3(){
//        Fruit fruit1 = new Fruit();
//        Fruit fruit2 = new Fruit();
//        Assert.assertSame(fruit1.num, fruit2.num);  // it checks for the object addresses in the memory
//    }
//
//    @Test
//    public void test4(){
//        Fruit fruit1 = new Fruit();
//        Fruit fruit2 = new Fruit();
//        Assert.assertEquals(fruit1.num, fruit2.num);  // it checks for the values of the object
//    }
//
//    @Test
//    public void test1(){
//        Assert.assertFalse(false);
//    }
//
//    @Test
//    public void test2(){
//        Assert.assertNull(word);
//    }

    @Test
    public void test6() throws Exception {
        Assert.assertThrows(new Assert.ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                throw new Exception();
            }
        });

    }
}

class Fruit {
    public static String num = new String("nine");
}



