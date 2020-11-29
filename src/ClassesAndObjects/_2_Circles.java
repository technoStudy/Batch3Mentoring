package ClassesAndObjects;

/*
- Create a Circle class with a field of 'int radius' and a method 'double area()'
 */

class Circle2 {
    int radius;

    double area() {
        return radius * radius * 3.14;
    }
}

public class _2_Circles {
    public static void main(String[] args) {
        /* Exercise-1:
        - Create an array with size of 5 accepting Circle objects.
        - Populate the array with Circle objects.
        - Find the average radius of the circles
        - Find the average of the areas of the circles
         */

        Circle2[] circles = new Circle2[5];

        Circle2 cicle1 = new Circle2();
        circles[0] = cicle1;
        cicle1.radius = 8;

        Circle2 cicle2 = new Circle2();
        circles[1] = cicle2;
        cicle2.radius = 13;

        Circle2 cicle3 = new Circle2();
        circles[2] = cicle3;
        cicle3.radius = 12;

        Circle2 cicle4 = new Circle2();
        circles[3] = cicle4;
        cicle4.radius = 19;

        Circle2 cicle5 = new Circle2();
        circles[4] = cicle5;
        cicle5.radius = 17;

        int totalRadii = 0;
        for (int i = 0; i < 5; i++) {
            totalRadii += circles[i].radius;
        }
        double aveRadii = totalRadii / 5.0;
        System.out.println(aveRadii);



    }
}
