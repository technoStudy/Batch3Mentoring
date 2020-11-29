package Demo;

public class Demo {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("text");
        String str2 = new String("text");
        System.out.println(str2.equals(sb1));

        String str = "text";

//        System.out.println(str.equals(sb));
//        String replacedStr = str.replace("et", sb);
//        System.out.println(replacedStr);
        System.out.println(str);

        str.contains("d");


        String str1 = "text";


        StringBuilder sb2 = sb1;
        System.out.println(sb1.equals("str"));

        System.out.println(sb1.indexOf("h"));

    }
}
