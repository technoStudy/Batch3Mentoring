package AccessModifiers;

public class Demo2 {
    public static void main(String[] args) {

        System.out.println(ABeautifulClass.num);
    }

}

class ABeautifulClass{

    private ABeautifulClass(){}  // it prevents instantiating

    static int num = 9;

}