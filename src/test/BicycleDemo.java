package test;

public class BicycleDemo {
    public static void main(String[] args) {
        //Creating three different objects of bicycle
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        MountainBike mountainbike = new MountainBike();

        // Changing behaviours of the bike
        bike1.speedUp(10);
        bike1.changeCadence(20);
        bike1.changeGear(4);
        bike1.applyBrakes(2);
        bike1.changeCadence(30);
        bike1.printstates();

        bike2.speedUp(90);
        bike2.changeCadence(80);
        bike2.changeGear(5);
        bike2.speedUp(110);
        bike2.printstates();

        mountainbike.setChainRing(0);
        mountainbike.changeGearRatio(6);
        mountainbike.printingstates();


    }
}
