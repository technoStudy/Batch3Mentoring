package Abstraction.AbstractClasses;

public class MarketApp {

    public static void main(String[] args) {
        // Abstract classes cannot be instantiated.
        FatherMarket fatherMarket = new SonMarket();
        fatherMarket.sellFood();
        fatherMarket.repairElectronics();
        fatherMarket.takePhotos();
        fatherMarket.sellGardeningItems();

        System.out.println(fatherMarket instanceof SonMarket);     // true
        System.out.println(fatherMarket instanceof FatherMarket);  // true

        System.out.println("------------------");

        SonMarket sonMarket = new SonMarket();
        sonMarket.sellFood();
        sonMarket.repairElectronics();
        sonMarket.takePhotos();
        sonMarket.sellGardeningItems();

        System.out.println(sonMarket instanceof SonMarket);     // true
        System.out.println(sonMarket instanceof FatherMarket);  // true

    }
}
