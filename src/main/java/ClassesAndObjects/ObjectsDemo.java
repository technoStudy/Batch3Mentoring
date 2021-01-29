package ClassesAndObjects;

public class ObjectsDemo {
    public static void main(String[] args) {
        House houseOfJohn = new House();
        System.out.println("John's kitchen -->" + houseOfJohn.kitchenColor);

        House houseofAisha = new House();
        houseofAisha.kitchenColor = "blue";
        System.out.println("Aisha's kitchen -->" + houseofAisha.kitchenColor);

    }

}

class House {
    int area;
    String kitchenColor = "yellow";
}

