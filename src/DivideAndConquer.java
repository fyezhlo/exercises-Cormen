import java.util.Arrays;
import java.util.stream.IntStream;

public class DivideAndConquer {

    public static int[] mergeSort(int[] arr) {

        if (arr.length > 1) {
            int[] l = mergeSort(Arrays.copyOfRange(arr,0, arr.length/2));
            int[] r = mergeSort(Arrays.copyOfRange(arr, arr.length/2,arr.length));

            int lp = 0;
            int rp = 0;
            int i = 0;

            while (lp < l.length && rp < r.length) {
                if (l[lp] <= r[rp]) {
                    arr[i] = l[lp];
                    lp++;
                }
                else {
                    arr[i] = r[rp];
                    rp++;
                }
                i++;
            }
            while (lp < l.length)
            {
                arr[i] = l[lp];
                lp++;
                i++;
            }
            while (rp < r.length)
            {
                arr[i] = r[rp];
                rp++;
                i++;
            }
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
        output(mergeSort(new int[] {2,7,6,3,5,1,1}));
    }
}
