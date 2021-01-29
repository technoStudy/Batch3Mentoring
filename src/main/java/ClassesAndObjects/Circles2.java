package ClassesAndObjects;

public class Circles2 {
      /* Exercise-2:
        - Create an array with size of 5 accepting Circle objects.
        - Create an array with size of 5 accepting int values
           (These values will be used as radius).
        - Populate the array with Circle objects.(USE ONLY ONE CIRCLE OBJECT!)
        - Print the areas of Circle objects
        - Find the average of the areas of the circles
         */
      public static void main(String[] args) {
          Circle[] circles = new Circle[5];
          int[] radii = new int[]{15, 12, 9, 18, 16};

          for (int i = 0; i < 5; i++) {
              Circle circle = new Circle();
              circle.radius = radii[i];
              circles[i] = circle;
          }

          System.out.print("Areas of the circles are: ");
          double totalArea = 0;
          for (Circle circle : circles) {
              System.out.print(circle.area() + "   ");
              totalArea += circle.area();
          }
          double aveArea = totalArea/5;

          System.out.println("\nAverage of the areas is " + aveArea);
      }




}

class Circle {
    int radius;

    double area() {
        return radius * radius * 3.14;
    }
}
