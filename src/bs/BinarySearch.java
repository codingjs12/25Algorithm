package bs;

public class BinarySearch {
    public static int binarySearch(int[] A, int first, int last, int x) {
        if(first > last) {
            return -1;
        } else {
            int mid = (first + last)/2;
            if(x == A[mid]) {
                return mid;
            } else if(x < A[mid]) {
                return binarySearch(A, first, mid - 1, x);
            } else {
                return binarySearch(A, mid + 1, last, x);
            }
        }


    }
    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 14, 18, 20, 25, 27, 30, 35, 40, 45, 47};

        int location = binarySearch(arr, 0, arr.length - 1, 14);

        System.out.println(location);

    }
}
