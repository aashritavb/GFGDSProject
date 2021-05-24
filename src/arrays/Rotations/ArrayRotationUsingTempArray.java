package arrays.Rotations;

public class ArrayRotationUsingTempArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int d = 3;
        rotateArray(arr, n, d);
        printArray(arr, n);
    }

    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rotateArray(int arr[], int n, int d) {
        int k = 0;
        int i = 0, j = 0;
        //if d > size of the array itself
        d = d > n ? d % n : d;
        int tempArr[] = new int[d];
//Store the first d elements in a temp array
        for (i = 0; i < d; i++) {
            tempArr[i] = arr[i];
        }
        //Shift rest of the arr[]
        for (j = d, i = 0; i < (n - d); i++, j++) {

            arr[i] = arr[j];

        }
        while (k < d) {
            arr[i] = tempArr[k];
            i++;
            k++;
        }
    }
}
/**
 * METHOD 1 (Using temp array)
 * <p>
 * Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
 * 1) Store the first d elements in a temp array
 * temp[] = [1, 2]
 * 2) Shift rest of the arr[]
 * arr[] = [3, 4, 5, 6, 7, 6, 7]
 * 3) Store back the d elements
 * arr[] = [3, 4, 5, 6, 7, 1, 2]
 * Time complexity : O(n)
 * Auxiliary Space : O(d)
 */