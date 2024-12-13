package testCom;

public class TestArrayException {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<=arr.length;i++){
            //checking array out of bound execption
            System.out.println(arr[8]);
        }
    }
}
