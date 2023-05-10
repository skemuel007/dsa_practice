import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 6, 2};
        System.out.println("Original sequence:");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length);
        System.out.println("Sorted sequence:");
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {3, 5, 8, 9, 6, 2};
        System.out.println("Original sequence:");
        System.out.println(Arrays.toString(arr2));
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted sequence:");
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {3, 8, 5, 9, 6, 2};
        System.out.println("Original sequence:");
        System.out.println(Arrays.toString(arr3));
        quickSort(arr3, 0, arr3.length - 1);
        System.out.println("Sorted sequence:");
        System.out.println(Arrays.toString(arr3));
    }

    public static void quickSort(int arr[], int low, int high) {
        if ( low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        do {
            while (i <=j && arr[i] <= pivot) {
                i++;
            }

            while(i <= j && arr[j] > pivot) {
                j--;
            }
            if (i <= j)
                swap(arr, i, j);
        } while(i < j);
        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int i, j;
        var n1 = m - l + 1; var n2 = r - m;
        var left = new int[n1]; var right = new int[n2];
        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[m + j + 1];
        }
        i = 0;
        j = 0;
        var k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++; }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++; }

        // copy elements from the remain sub array
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void shellSort(int arr[], int length) {
        int gap = length / 2;
        while(gap > 0) {
            int i = gap;
            while(i < length) {
                int temp = arr[i];
                int j = i - gap;

                while(j > 0 && arr[j] > temp) {
                    arr[j + gap] = arr[j];
                    j = j - gap;
                }
                arr[j+gap] = temp;
                i = i + 1;
            }

            gap = gap / 2;
        }
    }

    public static void insertionSort(int arr[], int length) {
        for (int i = 1; i < length; i++) {
            int temp = arr[i];
            int position = i;

            while(position > 0 && arr[position - 1] > temp) {
                arr[position] = arr[position -1];
                position = position - 1;
            }

            arr[position] = temp;
        }
    }

    public static void bubbleSort(int[] arr, int length) {
        // passes
        for (int pass = length -1; pass >= 0; pass--) {
            for(int i = 0; i < pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr, int length) {
        for(int i = 0; i < length - 1; i++) { // stops at one less than the original position
            int position = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[position])
                    position = j;
            }
            int temp = arr[i];
            arr[i] = arr[position];
            arr[position] = temp;
        }
    }
}
