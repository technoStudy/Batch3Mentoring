package WritingTestCases;

/*
Write many test cases for the both of the methods of Grading class
using assertEqual, assertNotEqual, assertTrue, assertFalse
 */


import org.junit.Assert;
import org.junit.Test;

public class GradingTests {

    Grading student1 = new Grading();

    @Test
    public void test1ForA (){
        LetterGrade expected = LetterGrade.A;
        LetterGrade actual = student1.letterGradeOf(93);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2ForA (){
        LetterGrade expected = LetterGrade.A;
        LetterGrade actual = student1.letterGradeOf(90);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3ForA (){
        LetterGrade expected = LetterGrade.A;
        LetterGrade actual = student1.letterGradeOf(100);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1ForB (){
        LetterGrade expected = LetterGrade.B;
        LetterGrade actual = student1.letterGradeOf(80);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2ForB (){
        LetterGrade expected = LetterGrade.B;
        LetterGrade actual = student1.letterGradeOf(89);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3ForB (){
        LetterGrade expected = LetterGrade.B;
        LetterGrade actual = student1.letterGradeOf(82);
        Assert.assertEquals(expected, actual);
//        Assert.assertTrue(expected == actual);
    }

 // assertTrue testing
    @Test
    public void testForPassOrFail (){
        student1.passOrFail(LetterGrade.A);
        Assert.assertTrue(student1.hasPassed);
    }

}
