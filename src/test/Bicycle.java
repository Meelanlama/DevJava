package test;

public class Bicycle {
    // States of bicycle(Stores in Variables)
    int cadence = 0;
    int gear = 1;
    int speed = 0;

    // Behaviour(Methods of object)
    void changeCadence(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment){
        speed = speed + increment;
    }

    void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    void printstates() {
        System.out.println("Cadence:" + cadence + " Speed:" + speed + " Gear:" + gear);
    }
}

//Constructor
//public Bicycle (int startCadence, int startSpeed, int startGear){
//    gear = startGear;
//    cadence = startCadence;
//    speed = startSpeed;
//}
// Bicycle myBike = new Bicycle(1,45,5);

//Method
//public class DataArtist{
//
//    public String draw(String art){
//        return art;
//    }
//    public void draw(int noOfArt){
//         draw = noOfArt
//    }
//}