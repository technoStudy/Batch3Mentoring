package Inheritence.Library;

public class NonFictionBook extends Book {

    private int grade;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public NonFictionBook(String title, String language, int pageNum) {
        super(title, language, pageNum);
    }

}
