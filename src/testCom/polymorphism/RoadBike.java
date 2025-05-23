package testCom.polymorphism;

public class RoadBike extends Bicycle{
    private int tireWidth;

    public RoadBike(int startCadence, int startSpeed, int startGear, int newTireWidth){
        super(startCadence,startGear,startSpeed);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth(){
        return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth){
        this.tireWidth = newTireWidth;
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("The RoadBike" + " has " + getTireWidth() +
                " MM tires.");
    }
}
