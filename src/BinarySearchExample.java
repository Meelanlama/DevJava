public class BinarySearchExample {
    //Binary search method
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            //mid = 9 + (9 - 9) / 2
            //    = 9 + (0) / 2
            //    = 9 + 0
            //    = 9
            int mid = left + (right - left) / 2;

            //check if the target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            //if the target is greater than the value at mid then ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            //if the target is less than value at mid then ignore right half;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 91;
        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index:" + result);
        }
    }
}
