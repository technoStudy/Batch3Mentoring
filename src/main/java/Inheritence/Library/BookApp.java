package Inheritence.Library;

/*
- Create Book, FictionBook, NonFictionBook classes
 */


public class BookApp {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("Fiction Book Title 1", "English", 158, "Somebody");
        System.out.println(fiction);

        NonFictionBook nonFictionBook = new NonFictionBook("Non Fiction Book Title", "Russian", 256);
        nonFictionBook.setGrade(8);
        System.out.println(nonFictionBook);
    }
}
