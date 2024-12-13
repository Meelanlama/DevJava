public class SelectionSort {

    public void sort(int[] arr) {
        //Finding the minimum element in the unsorted array
        for (int i = 0; i < arr.length; i++) {
            int minimum_index = i; // here holding the index of i at first which is 0.
            //Moving in the inner loop to compare the index like(0 and 1, here i is 0 where j is 1; and so on i=2; j= i+1(3))
            for (int j = i + 1; j < arr.length; j++) {
                //Comparing if the value of array at 1 is less than 0. If so then minimum index will be the index of j;
                if (arr[minimum_index] > arr[j])
                    minimum_index = j;
            }

            //swap the found minimum element with first element;
            int helper = arr[minimum_index];
            arr[minimum_index] = arr[i];
            arr[i] = helper;
        }
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort test = new SelectionSort();
        int[] arr = {64, 25, 12, 22, 11};
        test.sort(arr);
        System.out.println("Sorted Array:");
        test.printArray(arr);
    }
}
