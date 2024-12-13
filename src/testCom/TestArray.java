package testCom;

public class TestArray {
    //creating a method which receives an array as parameter
    static void min(int arr[]){
        int min = arr[0];

        for(int i=1;i<arr.length;i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arry[]={1,2,3,4,5}; // declaring and initializing an array
        min(arry); //passing an array to method
    }
}
