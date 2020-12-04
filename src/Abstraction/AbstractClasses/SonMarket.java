package Abstraction.AbstractClasses;

public class SonMarket extends FatherMarket{

    @Override
    public void repairElectronics() {
        System.out.println("I repair Apple products.");
    }

    @Override
    public void takePhotos() {
        System.out.println("I can take passport-size photos.");
    }


}
