package Encapsulation;

public class Demo {

    int num1;
    String str;
    boolean bool;

    public Demo(int num1, String str, boolean bool) {
        this.num1 = num1;
        this.str = str;
        this.bool = bool;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

//    @Override
    public String toString() {
        return "Demo{" +
                "num1=" + num1 +
                ", str='" + str + '\'' +
                ", bool=" + bool +
                '}';
    }



}
