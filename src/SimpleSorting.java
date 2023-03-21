public class SimpleSorting {

    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int key = arr[i];

            while (j >= 0 && arr[j] < key) {
                arr[j+1] = arr[j];
                arr[j] = key;
                j--;
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;

            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minId = j;
                }
            }
            arr[minId] = arr[i];
            arr[i] = min;
        }
        return arr;
    }

    public static void output(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        output(insertionSort(new int[] {2,7,6,3,5,1,1}));
    }

}