package Constructors;

/*
- Create a Car class
- Fields are int model, String brand, int price
- Overwrite the default constructor
- Create (overload) two more parameterized constructors (use the fields)
- Create a toString method
 */

public class Car {
    int model;
    String brand;
    int price;

    public Car() {
        System.out.println("Enjoy your new car!");
    }

    public Car(int modelOfTheCar) {
        this.model = modelOfTheCar;
    }

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String toString() {
        String str = "Car brand is " + brand + ", Car model is " + model + ", Car price is " + price;

        return str;
    }
}

class UseOfCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 18500);
        car1.model = 2020;
        System.out.println(car1.toString());
    }
}