package testCom;

public class RecursionExample1 {
   /* static void a(){
        System.out.println("Hello world");
        a();
    }

    public static void main(String[] args) {
        a();
    } */

    //Recursive method to calculate factorial
    public static int factorial(int n){
        //Base case: if n is 0, return 1
        if(n==0){
            return 1;
        }

        //Recursive case: n * factorial of(n-1)
        return (n * factorial(n-1));
    }

    public static void main(String[] args) {
        //Test factorial method
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

    }
}
