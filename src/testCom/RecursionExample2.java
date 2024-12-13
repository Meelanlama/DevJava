package testCom;

public class RecursionExample2 {

    //Recursive method to calculate Fibonacci number
    public static int fibonacci(int n){
        //Base case: f(0)=0; f(1)=1;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        //Recursive case: f(n)=f(n-1)+f(n-2)
        return  fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        //testing fibonacci method
        int number = 7;
        int result = fibonacci(number);
        System.out.println("Fibonacci number at position " + number + " is: " + result);
    }
}
