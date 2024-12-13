package testCom;

public class MultiArray {
    public static void main(String[] args) {
        // declaring and intializing 2D array
        int arr[][] ={{1,2,3},{2,4,5},{4,4,5}};
        //printing 2D array
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println(); //moving next line after printing each row
        }
    }
}

// Explain
//int arr[][] = {
//        {1, 2, 3},
//        {2, 4, 5},
//        {4, 4, 5}
//};

/*This means:
arr[0][0] = 1, arr[0][1] = 2, arr[0][2] = 3
arr[1][0] = 2, arr[1][1] = 4, arr[1][2] = 5
arr[2][0] = 4, arr[2][1] = 4, arr[2][2] = 5
 */