package Abstraction.AbstractClasses;

public abstract class FatherMarket {

    public void sellFood(){
        System.out.println("I am trading food");
    }

    public  void sellGardeningItems(){
        System.out.println("I sell lawning machine.");
    }

    public abstract void repairElectronics();

    public abstract void takePhotos();

}
