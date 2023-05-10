public class SearchAlgorithms {

    public static void main(String[] args) {

        int[] arr = {2,3 , 7, 8, 9, 12};
        System.out.println(linearSearch(arr, arr.length, 8));

        int[] arr2 = {15, 21, 47, 84, 96};
        System.out.println(binarySearchIteration(arr2, arr2.length, 84));

        int[] arr3 = {15, 21, 47, 84, 96};
        System.out.println(binarySearchRecursion(arr2, 96, 0, arr3.length));


    }
    public static int linearSearch(int[] arr, int length, int searchTerm) {
        int index = 0;
        
        while(index < length) {
            
            if (arr[index] == searchTerm)
                return index;
            index++;
        }
        
        return -1;
    }

    public static int binarySearchIteration(int[] arr, int length, int searchTerm) {
        int left = 0;
        int right = length - 1;

        while(left <= right) {
            int middle = (left + right) / 2;
            if ( arr[middle] == searchTerm) {
                return middle;
            } else if (searchTerm < arr[middle]) {
                right = middle - 1;
            } else if (searchTerm > arr[middle]) {
                left = middle + 1;
            }
        }
        return - 1;
    }

    public static int binarySearchRecursion(int[] arr, int searchTerm, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == searchTerm) {
            return mid;
        } else if (searchTerm < arr[mid] ) {
            return binarySearchRecursion(arr, searchTerm, left, mid - 1);
        } else if (searchTerm > arr[mid]) {
            return binarySearchRecursion(arr, searchTerm, mid + 1, right);
        }
        return - 1;
    }
}
