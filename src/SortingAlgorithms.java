/**
 * A class to implement all the sorting algorithms
 * so that we can test timing.
 *
 * @author: Nandhini Namasivayam
 * @version February 2025
 */
public class SortingAlgorithms {
    // Change this value to change testing size
    public static final int TEST_SIZE = 10;

    // Change this value to change the range of numbers generated
    public static final int MAX_NUMBER_SIZE = 100;

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        // TODO: Implement bubble sort
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        // TODO: Implement selection sort
        int temp = -1;
        for (int i = 0; i < arr.length -1; i++) {
            int smallest = 0;
            for (int j = 0; j < arr.length -i -1; j++) {
                if (arr[j] < arr[smallest])
                    smallest = j;
            }
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr) {
        // TODO: Implement merge sort
    }

    private static void mergeSortHelper(int[] arr, int left, int right) {
        // TODO: Implement the recursive helper for merge sort
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        // TODO: Implement the merge step for merge sort
    }

    // Quick Sort
    public static void quickSort(int[] arr) {
        // TODO: Implement quick sort
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        // TODO: Implement the recursive helper for quick sort
    }

    private static int partition(int[] arr, int low, int high) {
        // TODO: Implement the partition step for quick sort
        return 0; // Placeholder
    }
}