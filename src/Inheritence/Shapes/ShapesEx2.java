package Inheritence.Shapes;

public class ShapesEx2 {
    public static void main(String[] args) {
         /*
        - Create a Parallelogram object
        - Create a Square object
        - Assign square to parallelogram
        - print fields of parallelogram
         */

        Parallelogram parallelogram;
        Square square = new Square(11);

        parallelogram = square;
        System.out.println(parallelogram.side1);
        System.out.println(parallelogram.side2);
        System.out.println(parallelogram.angle);
    }
}
