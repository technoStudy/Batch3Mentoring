package AccessModifiers;

class Demo1 {
    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();

//        System.out.println(anotherClass.num);   Compile time error

    }


}

class AnotherClass{
    private int num = 9;
}

public class SomeOtherClass {
    private class APrivateClass{

    }
}
