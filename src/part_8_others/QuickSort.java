package part_8_others;

/**
 * Created by oneball on 2018/5/9.
 */
public class QuickSort {

    private static int[] quickSort(int[] A, int n) {
        quick(A, 0, n - 1);
        return A;
    }

    private static int[] quick(int[] A, int low, int high) {
        if (low < high) {
            int mid = sort(A, low, high);
            quick(A, low, mid - 1);
            quick(A, mid + 1, high);
        }
        return A;
    }

    private static int sort(int[] A, int low, int high) {
        int key = A[low];
        int i = low;
        int j = high;

        if (i < j) {
            while (i < j) {
                while (i < j && key <= A[j]) {
                    j--;
                }
                if (i < j) {
                    A[i] = A[j];
                }

                while (i < j && A[i] <= key) {
                    i++;
                }
                if (i < j) {
                    A[j] = A[i];
                }
            }
            A[i] = key;
        }
        return i;
    }


    public static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 8, 9, 6};
        int[] arrs = quickSort(arr, 7);
        printArray(arrs);
    }
}
