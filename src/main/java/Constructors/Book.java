package Constructors;

/*
- Default constructor
- Overwriting default constructor
- Parameterized constructors (Constructor overloading)
- private default constructor and use of it
 */

public class Book {

    int num;
    String str;

    // A constructor has NO RETURN TYPE
    // Constructor's name should exactly be the same as the Class name
    public Book() {
        System.out.println("Default constructor");
    }

    public Book(int number, String strng){
        this.num = number;
        this.str = strng;
    }

    public Book(int num1){
        this.num = num1;
    }

}

class NoteBook {
    private NoteBook(){}
}

class Demo{
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book(23, "Hello");

        System.out.println(book1.num);
        System.out.println(book2.num);

    }
}




