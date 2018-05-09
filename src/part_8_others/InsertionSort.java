package part_8_others;

/**
 * Created by oneball on 2018/5/9.
 */
public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        int i, j, temp;

        for (i = 1; i < n; i++) {
            temp = A[i];
            for (j = i; j > 0 && A[j - 1] > temp; j--) {
                A[j] = A[j - 1];
            }
            A[j] = temp;
        }


        return A;
    }
}
