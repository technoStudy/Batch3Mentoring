package WritingTestCases;


public class Grading {

    /*
    -Write a method whose name is letterGradeOf
    -The method takes an int and returns an enum (LetterGrade)
    - The method return the corresponding letter grade of a score between 0 and 100 (inclusive)
      in accordance with the table below:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59

     */
    public LetterGrade letterGradeOf(int score) {

        if (score <= 100 && score >= 90) return LetterGrade.A;
        else if (score <= 89 && score >= 80) return LetterGrade.B;
        else if (score <= 79 && score >= 70) return LetterGrade.C;
        else if (score <= 69 && score >= 60) return LetterGrade.D;
        else if (score <= 59 && score >= 0) return LetterGrade.F;
        else return LetterGrade.UnsupportedGrade;
    }


    /*
    - Create a boolean filed named hasPassed
     */
    boolean hasPassed;

    /*
    -Write a method whoso name is passOrFail
    - it takes LetterGrade enums and return String
    - if the grade is A, B, C or D then the method assigns hasPassed true and returns "You have earned class credits."
    - if the grade is F then the method assigns hasPassed false and returns "Sorry you could not get any credits." .
     */
    public String passOrFail(LetterGrade grd) {
        if (grd != LetterGrade.UnsupportedGrade) {
            if (grd == LetterGrade.A || grd == LetterGrade.B || grd == LetterGrade.C || grd == LetterGrade.D) {
                hasPassed = true;
                return "You have earned class credits.";
            } else {
                hasPassed = false;
                return "Sorry you could not get any credits.";
            }
        } else
            return "Unsupported Grade Given!";
    }

}

