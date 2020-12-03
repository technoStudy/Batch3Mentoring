package AccessModifiers.Package2;

import AccessModifiers.Package1.Pack1Class1;

public class Pack2Class1 {

    public static void main(String[] args) {
        Pack1Class1 c = new Pack1Class1();
//        System.out.println(c.defaultString);  // compile time error
    }
}
