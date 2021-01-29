package DateAndTimeClasses;

public class OCA_SampleQuestions {

    /*
    Question - 1:

    Which of the following can be inserted into the blank to create a date of June 21, 2014?
    (Choose all that apply)

    import java.time.*;
    public class StartOfSummer {
    public static void main(String[] args) {
    LocalDate date = ____________________________
    }
    }
    A. new LocalDate(2014, 5, 21);
    B. new LocalDate(2014, 6, 21);
    C. LocalDate.of(2014, 5, 21);
    D. LocalDate.of(2014, 6, 21);    <---- answer
    E. LocalDate.of(2014, Calendar.JUNE, 21);
    F. LocalDate.of(2014, Month.JUNE, 21);   <---- answer

     */

    /*
    Question - 2:

     What is the output of the following code?

    LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
    date.plusDays(2);
    date.plusYears(3);
    System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    A. 2018 APRIL 2
    B. 2018 APRIL 30   <---- answer
    C. 2018 MAY 2
    D. 2021 APRIL 2
     */

    /*
    Question - 3:

    What is the output of the following code?

    LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
    System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    A. 2018 APRIL 4
    B. 2018 APRIL 30
    C. 2018 MAY 10
    D. Another date.
    E. The code does not compile.
    F. A runtime exception is thrown.
     */

    /*
    Question - 4:

    What is the output of the following code?

    LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
    date.plusDays(2);
    date.plusHours(3);
    System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    A. 2018 APRIL 2
    B. 2018 APRIL 30
    C. 2018 MAY 2
    D. The code does not compile.
    E. A runtime exception is thrown.
     */

    /*
    Question - 5:
    What is the output of the following code?

    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.ofDays(1).ofYears(2);
    d = d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    System.out.println(f.format(d));
    A. 5/9/13 11:22 AM
    B. 5/10/13 11:22 AM
    C. 5/9/14
    D. 5/10/14
    E. The code does not compile.
    F. A runtime exception is thrown.
     */

    /*
    Question - 6:

    What is the output of the following code?

    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.of(1, 2, 3);
    d = d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    System.out.println(d.format(f));
    A. 3/7/14 11:22 AM
    B. 5/10/15 11:22 AM
    C. 3/7/14
    D. 5/10/15
    E. 11:22 AM
    F. The code does not compile.
    G. A runtime exception is thrown.
     */

}
