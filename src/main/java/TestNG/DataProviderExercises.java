package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExercises {

    Object[] array1 = {"John", null, 56};
    Object[] array2 = {"Marilyn", "Watt", null};
    Object[] array3 = {null, "Mahmud", 11};

    @DataProvider
    public Object[][] nameProvider() {
        return new Object[][]{
                array3
        };
    }

    @DataProvider
    public Object[][] nameProvider2() {
        return new Object[][]{
                array1,
                array3
        };
    }

    @Test(dataProvider = "nameProvider2")
    public void testName(String firstName, String lastName, Integer age) {
//        System.out.println("My name is " + firstName + " " + lastName);
        System.out.println("I am " + age + " years old.");
    }

}
