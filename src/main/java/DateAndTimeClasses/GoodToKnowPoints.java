package DateAndTimeClasses;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class GoodToKnowPoints {

    public static void main(String[] args) {
//        LocalDate date;
//        LocalTime time;
//        LocalDateTime dateTime;

    /*
    1 - Date and time classes overwrites equal() method
     */
//        {
//            LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
//            LocalDate date2 = LocalDate.of(2015, 1, 20);
//            System.out.println(date1.equals(date2));  // prints true
//            System.out.println(date1 == date2);   // prints false
//        }


    /*
    2 - Date and time classes cannot be instantiated.

    LocalDateTime date1 = new LocalDateTime();  // compile time error

     */


    /*
    3 - For months in the NEW date and time methods, Java counts starting from 1 like we human beings do.

    4 - Literally you may use Calender enum along with new date and time classes
        BUT it will come out with a completely different and confusing result!
     */

//        LocalDate date = LocalDate.of(2018, Calendar.DECEMBER, 30);
//        System.out.println(date);

//        compiles and runs. This code prints out:
//        2018-11-30  // December is printed out as 11th month !!!

//        On the other hand
//        LocalDate date2 = LocalDate.of(2018, Calendar.JANUARY, 30);
//        System.out.println(date2);

//        compiles but throws DateTimeException since January is indexed as 0 with Calender enum.
//        Hence, do not use Calender enums along with new date and time classes.
//        Instead use Month enums !!!


    /*
    5 - The date and time classes are immutable (just like String was).
        So, the return value must be used.

        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusMonths(2);
        date.plusYears(3);
        System.out.println(date);
        //prints 2018-04-30

        LocalDate date2 = LocalDate.of(2018, Month.APRIL, 30);
        date2 = date2.plusMonths(2);
        date2 = date2.plusYears(3);
        System.out.println(date2);
        // prints 2021-06-30
*/

    /*
    6 - Java is smart enough to realize leap years.

        LocalDate newDate = LocalDate.of(2020, 2, 28);
        newDate = newDate.plusDays(1);
        System.out.println(newDate);
          */

    /*
    7 - Java is smart enough to hide the seconds and nanoseconds when we aren’t using them.

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15 );
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-19T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020-01-19T19:14:30
     */


    /*
    8 - It is common for date and time methods to be chained.

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15 );
        LocalDateTime dateTime = LocalDateTime.of(date, time)
                .minusDays(1).minusHours(10).minusSeconds(30);
        */


    /*
    9 - LocalDate does not contain time.

    LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
    date = date.plusMinutes(1);   // DOES NOT COMPILE
     */


    /*
    10 - You cannot chain methods when creating a Period. If you chain Period.ofXXX methods,
         only the last method is used because they are static methods.

        Period wrong = Period.ofYears(1).ofWeeks(1); // every week
//This tricky code is really like writing the following:
//        Period wrong = Period.ofYears(1);
//        wrong = Period.ofWeeks(7);

        LocalDate ld = LocalDate.of(2020, 11, 19);
        ld = ld.plus(wrong);
        System.out.println(ld);
     */



    /*
    11 - Period.of() method allows us to pass in the number of years, months, and days at the same time.

        Period customPeriod = Period.of(1, 0, 7);  // every year and 7 days
     */

    /*
    12 - Period is a day or more of time. There is also Duration class, which is intended for smaller units of time.
         For Duration, you can specify the number of days, hours, minutes, seconds, or nanoseconds.

     */

    /*
    13 - Period class cannot be used with LocalTime objects since you cannot specify hour, minute,
         second or nanoseconds with Period objects.

        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);

        System.out.println(date.plus(period)); // 2015-02-20
        System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
        System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
     */



    }

}
