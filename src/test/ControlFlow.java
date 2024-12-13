package test;

public class ControlFlow {
    public static void main(String[] args) {

//        void applyBrakes(){
//            if(isMoving){
//                currentspeed--;
//            }else{
//                System.out.println("The bicycle has stopped");
//            }
//        }
        int testScore = 99;
        char grade;

        if(testScore>=90){
            grade = 'A';
        }else if(testScore>=80){
            grade = 'B';
        } else if (testScore>=70) {
            grade = 'C';
        } else if (testScore>=40) {
            grade= 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade= " + grade);
    }
}
