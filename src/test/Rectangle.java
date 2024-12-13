package test;

public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    //Here are four constructor

    // Constructor 1: Default constructor with the origin at (0, 0)
    public Rectangle(){
        origin = new Point(0,0);
    }
    // Constructor 2: Takes a Point object as the origin
    public Rectangle(Point p){
        origin = p;
    }
    // Constructor 3: Takes width and height, with the origin at (0, 0)
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    // Constructor 4: Takes a Point object, width, and height
    public Rectangle(Point p, int w, int h){
        origin = p;
        width = w;
        height = h;
    }

    // Method for moving the rectangle
    public void move(int x, int y){
        origin.x = x;
        origin.y = y;
    }

    //Method for getting the area of rectangle
    public int getArea(){
        return height * width;
    }
}

