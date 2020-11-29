package SwitchWithEnums;

/*
- Ex3:
      Create a class of Car with field price (type double)
      Create a parameterized constructor with double price
      Create a method and use switch to calculate the price of a car
      Method name is endOfYearPrice, parameter is enum Month, return double
      Method calculates the end of year price of a car starting from the month it is purchased in.
      Every month (starting from the month purchased) the value(price) of the car decreases from the previuos month's price
      Value decrease rates are as follows.
      Jan -> %9         May -> %3           Sep -> %2
      Feb -> %5         Jun -> %1           Oct -> %1
      Mar -> %4         Jul -> %2           Nov -> %1
      Apr -> %5         Aug -> %3           Dec -> %5
 */
public class SwitchEx3 {
    public static void main(String[] args) {
        Car toyota = new Car(21500);
        double finalCarPrice = toyota.endOfYearPrice(Month.JAN);
        System.out.printf("%8.2f", finalCarPrice);
    }
}

class Car{
    double price;

    public Car(double price){
        this.price = price;
    }

    public double endOfYearPrice(Month month){
        switch (month){
            case JAN:
                price = price - price * 9/100;
            case FEB:
                price = price - price * 5/100;
            case MAR:
                price = price - price * 4/100;
            case APR:
                price = price - price * 5/100;
            case MAY:
                price = price - price * 3/100;
            case JUN:
                price = price - price * 1/100;
            case JUL:
                price = price - price * 2/100;
            case AUG:
                price = price - price * 3/100;
            case SEP:
                price = price - price * 2/100;
            case OCT:
                price = price - price * 1/100;
            case NOV:
                price = price - price * 1/100;
            case DEC:
                price = price - price * 5/100;
        }
        return price;
    }
}
