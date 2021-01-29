package Encapsulation;

import java.time.LocalDate;
import java.util.Scanner;
// setter method makes it write-only
// getter method makes read-only


public class DateOfBirth {

    private int year;
    private int month;
    private int day;
    private LocalDate dob;


    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private LocalDate setDob(int year, int month, int day){
        return LocalDate.of(year, month, day);
    }


    public LocalDate getDob() {
        return setDob(year,month, day);
    }

}

class PrintDoB {


    public static void main(String[] args) {

        DateOfBirth myDoB = new DateOfBirth();

        Scanner keybord = new Scanner(System.in);
        System.out.println("Enter your birth year");
        myDoB.setYear(keybord.nextInt());

        System.out.println("Enter your birth month");
        myDoB.setMonth(keybord.nextInt());

        System.out.println("Enter your birth day of the month");
        myDoB.setDay(keybord.nextInt());

        System.out.println("Your day of birth is: " + myDoB.getDob());
        System.out.println("You are " + myDoB.getDob().toEpochDay() + " days old.");

    }


}
