package testCom.polymorphism;

public class TestBikes {
    public static void main(String[] args) {
        Bicycle bike1, bike2, bike3;

        bike1 = new Bicycle(10,200,5);
        bike2 = new MountainBike(20,90,2,"Dual");
        bike3 = new RoadBike(30,30,5,24);

        bike1.printDescription();
        bike2.printDescription();
        bike3.printDescription();
    }
}
