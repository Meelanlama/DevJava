package testCom.polymorphism;

public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType){
        super (startCadence,startSpeed,startGear);
        this.SetSuspension(suspensionType);
    }

    public String getSuspension(){
        return this.suspension;
    }

    public void SetSuspension(String suspensionType){
        this.suspension = suspensionType;
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("The MountainBike has a " + getSuspension() +" suspension.");
    }
}
