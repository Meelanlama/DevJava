package testCom;

public class CloneArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Printing  original array:");
        for(int print:arr){
            System.out.println(print);
        }

        System.out.println("Printing clone array:");
        int cloneArr[] = arr.clone();
        for(int i: cloneArr){
            System.out.println(i);
        }

        System.out.println("Equal?");
        System.out.println(arr==cloneArr);
    }
}
