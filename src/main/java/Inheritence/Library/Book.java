package Inheritence.Library;

public class Book {

    String title, language;
    int pageNum;

    public Book(String title, String language, int pageNum) {
        this.title = title;
        this.language = language;
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }

}
