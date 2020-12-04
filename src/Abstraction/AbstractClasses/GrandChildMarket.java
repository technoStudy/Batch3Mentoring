package Abstraction.AbstractClasses;

public class GrandChildMarket extends DaughterMarket{

    @Override  // Abstraction
    public void takePhotos() {
        System.out.println("I can take large size photos.");
    }

    @Override  // inheritance
    public void repairElectronics(){
        System.out.println("I have started to repair Apple products.");
    }


}
