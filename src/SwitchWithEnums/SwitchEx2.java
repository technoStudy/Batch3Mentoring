package SwitchWithEnums;

/*
Write a switch case which takes Month enum values and prints out the season of the year.
(Dec, Jan, Feb -> Winter
 Mar, Apr, May -> Spring
 Jun, Jul, Aug -> Summer
 Sep, Oct, Nov -> Fall
 */

public class SwitchEx2 {
    public static void main(String[] args) {
        Month month = Month.JUL;
        switch (month){
            case DEC:
            case JAN:
            case FEB:
                System.out.println("Winter");
                break;
            case MAR:
            case APR:
            case MAY:
                System.out.println("Spring");
                break;
            case JUN:
            case JUL:
            case AUG:
                System.out.println("Spring");
                break;
            case SEP:
            case OCT:
            case NOV:
                System.out.println("Spring");
                break;

        }
    }
}
