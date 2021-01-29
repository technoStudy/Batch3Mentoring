package ClassesAndObjects;

/*
- Create a Book class with at least a field of 'title' and 'pageNumber'
- Create a Student class with a field of 'name' and a method of 'hasRead'
- Student class also has a field of ArrayList (say readBooks) of Book objects
- hasRead method of Student class accepts a Book object
- let hasRead method adds the argument of Book object to the ArrayList
 */

import java.util.ArrayList;

class Book {
    String title;
    int pageNumber;
int grade;

}

class Student {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    void hasRead(Book book) {
        books.add(book);
    }
}


public class _3_BookWorms {
    public static void main(String[] args) {
        /*
        - Create a Student object
        - Create at least five Book objects
        - Let the student read the books in a way you like/define
        - Print the total number of pages the student has read

        (optional)
        - Create more students
        - Find and print the student who wins "The Book Worm Award" (who read the max number of pages)
        - (Optional) Find and print the 'total number' and 'average' of pages read int the class
         */

        Student stu1 = new Student();
        stu1.name = "Ali";

        Book book1 = new Book();
        book1.title = "Peter Pan";
        book1.pageNumber = 89;

        Book book2 = new Book();
        book2.title = "Alice in Wonderland";
        book2.pageNumber = 78;

        Book book3 = new Book();
        book3.title = "I love Java";
        book3.pageNumber = 158;

        Book book4 = new Book();
        book4.title = "A little Prince";
        book4.pageNumber = 108;

        Book book5 = new Book();
        book5.title = "I know Turkish";
        book5.pageNumber = 147;

        stu1.hasRead(book4);
        stu1.hasRead(book1);
        stu1.hasRead(book2);

        int totalPages = 0;
        for (Book book : stu1.books) {
            totalPages += book.pageNumber;
        }

        System.out.println(stu1.name + " has read " + totalPages + " pages.");
    }
}
