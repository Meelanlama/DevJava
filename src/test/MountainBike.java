package test;
// Inheritance
public class MountainBike extends Bicycle {
    // State
    int chainRing = 0;
    int gearRatio = 1;

   // behaviour
    void changeGearRatio(int newValue){
        gearRatio = newValue;
    }
    void setChainRing(int newValue){
        chainRing = newValue;
    }

    void printingstates(){
        System.out.println("Mountain Bike-Gear Ratio:" + gearRatio + " Chain Ring:" + chainRing);
    }
}
