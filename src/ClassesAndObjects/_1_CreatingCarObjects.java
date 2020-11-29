package ClassesAndObjects;

/*
- What is the relationship between a class and an object?
A class is like a blueprint/prototype and an object is 'an instance' of the class in the memory.

Exercise:
- Create a Car class with some properties/fields(states) and methods(behaviors).
- Create three different Car objects/instances(identities)
- Use the fields and methods of the objects by printing.
 */

class Car {
    String name;
    int model;
    int speed;

    void isMoving(int speed) {
        if (speed == 0) {
            System.out.println(name + " is parked.");
        } else if (speed > 0) {
            System.out.println(name + " is moving forward.");
        }
    }


}

public class _1_CreatingCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.name = "Toyota";
        car1.model = 2020;
        car1.speed = 10;

        Car car2 = new Car();
        car2.name = "Camry";
        car2.model = 2019;
        car2.speed = 0;

        car1.isMoving(car1.speed);
        car2.isMoving(car2.speed);


    }


}



