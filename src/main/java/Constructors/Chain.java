package Constructors;

/*
- Invoking a constructor by using the "new" keyword (without declaration or initializing)
- Invoking a constructor from another constructor by using "this()" keyword
- Chain invoking of constructors
 */

public class Chain {
    int x;

    public Chain(){
        this(3);
        System.out.println("Default constructor");
    }

    public Chain(int x){
//        this();
        System.out.println("constructor with int parameter");
    }
}

class UseofChainClass{
    public static void main(String[] args) {
        new Chain();
    }
}