package OCA_SampleQuestions;

public class Question11 {
/*
What is the output of the following program?

1: public class FeedingSchedule {
2: public static void main(String[] args) {
3: int x = 5, j = 0;
4: OUTER: for(int i=0; i<3; )
5: INNER: do {
6: i++; x++;
7: if(x > 10) break INNER;
8: x += 4;
9: j++;
10: } while(j <= 2);
11: System.out.println(x);
12: } }

A. 10
B. 12
C. 13
D. 17
E. The code will not compile because of line 4.
F. The code will not compile because of line 6.
*/
}



//class FeedingSchedule {
//    public static void main(String[] args) {
//        int x = 5, j = 0;
//        OUTER: for(int i=0; i<3; )
//            INNER: do {
//                i++; x++;   // x = 12
//                if(x > 10) break INNER;
//                x += 4;     // x=10
//                j++;   // j = 1
//            } while(j <= 2);
//        System.out.println(x);
//    } }