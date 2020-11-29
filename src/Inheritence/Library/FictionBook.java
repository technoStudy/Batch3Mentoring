package Inheritence.Library;

/*
If B inherits A (B ->A) then B is child class and A is parent class
or B is called sub class and A is called super class
 */

public class FictionBook extends Book{

    private String author;

    public FictionBook(String title, String language, int pageNum, String author) {
        super(title, language, pageNum);
        this.author = author;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "author='" + author + '\'' +
                super.toString() +
                '}';
    }

}
