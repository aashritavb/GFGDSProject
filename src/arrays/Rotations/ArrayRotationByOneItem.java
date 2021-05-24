package arrays.Rotations;

public class ArrayRotationByOneItem {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int d = 4;
        rotateArray(arr, n, d);
        printArray(arr, n);
    }



    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    private static void rotateArray(int[] arr, int n, int d) {
        int temp = 0 , counter=0 ;
;
        while(counter<d) {
            //extract front item into temp
            temp = arr[0];
            //left shift by 1 item
            for (int i = 0; i < n-1; i++) {
                arr[i]=arr[i+1];
            }
                arr[n-1]=temp;
            counter++;
        }
    }
}
/** METHOD 2 (Rotate one by one)
* Time complexity : O(n * d)
Auxiliary Space : O(1)
 */