package data.structures;

public class package data.structures;

public class OptimizedInsertionSort {

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];

            // Already sorted ,skip shifting
            if (arr[i - 1] <= key)
                continue;

            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5};
        insertionSort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
 {

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];

            // Already sorted ,skip shifting
            if (arr[i - 1] <= key)
                continue;

            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5};
        insertionSort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
