package SwitchWithEnums;

/*
- Structure of switch statements
- Create enum of Month
- Ex1:
      Create a class of House with field price (type double)
      Create a parameterized constructor with double price
      Create a method and use switch to calculate the price of the house
      Method name is finalPrice, parameter is enum month, returns double
      Method calculates the final price of the house according to month it is sold in.
      Jan -> +%12       Mar -> -%6      Jun -> +%23     Nov -> -%11     Other months no price change

      NOTE: "return" can be used as "break" statement.
 */


public class SwitchEx1 {
    public static void main(String[] args) {
        House MaryS = new House(125_587);
        double finalPriceOfHouse = MaryS.finalPrice(Month.NOV);
        System.out.println(finalPriceOfHouse);
    }
}

class House{
    // class field declared
    double price;

    // parameterized constructor
    public House(double price){
        this.price = price;
    }

    public double finalPrice(Month month){
        switch (month){
            case JAN:
                return price + price * 12 /100;
            case MAR:
                return price - price * 6 /100;
            case JUN:
                return price + price * 23 /100;
            case NOV:
                return price - price * 11 /100;
            default:
                return price;
        }
    }
}