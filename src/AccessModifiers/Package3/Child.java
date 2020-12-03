package AccessModifiers.Package3;

import AccessModifiers.Package2.Parent;

public class Child extends Parent{

    void printer(){
        Parent p = new Parent();
//        System.out.println(p.protectedString);   // compile time error
        System.out.println(protectedString);  // it runs
    }

}
