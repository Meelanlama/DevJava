package test;

public class CreateObjectDemo {
    public static void main(String[] args) {
        //Declaring and creating a point object and two rectangle objects
        test.Point originOne = new Point(23,94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50,100);

        //Displaying rectOne's width,height and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        //Setting the rectTwo's position
        rectTwo.origin = originOne;

        //Displaying rectTwo's position
        System.out.println("X position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y position of rectTwo: " + rectTwo.origin.y);

        //Moving rectTwo and displaying its new position
        rectTwo.move(40,72);
        System.out.println("X position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y position of rectTwo: " + rectTwo.origin.y);
    }
}
