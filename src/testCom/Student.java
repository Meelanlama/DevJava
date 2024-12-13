package testCom;

public class Student {
    int rollno;
    String name;
    String faculty;

    Student(int rollno,String name, String faculty){
        this.rollno=rollno;
        this.name=name;
        this.faculty=faculty;
    }

    public static void main(String[] args) {
        Student s1 = new Student(7,"Milan","Computing");
        Student s2 = new Student(1,"Hero","Test");

        //compiler automatically writes s1.toString();
        System.out.println(s1);
        System.out.println(s2);
    }
    //Overriding the toString() method
    public String toString(){
        return rollno + " " + name + " " + faculty;
    }
}
