import java.util.Arrays;
public class CyclicSort {
    void sort(int[] arr){
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if (correct >= 0 && correct < n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
    void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
    void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        CyclicSort ob = new CyclicSort();
        int[] arr = {3,5,4,1,2}; // Start from 1
        ob.sort(arr);
        System.out.print("Sorted Array: ");
        ob.printArray(arr);
    }
}
