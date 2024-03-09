/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 5, 7, 1, 3, 1, 2, 9, 7, 2 };
        int num = arr.length;
        
        Arrays.sort(arr);
        int[] temp = Arrays.copyOf(arr, num);
        int end = removeDuplicates(temp, num);
        
        for (int i = 0; i < end; i++) {
            System.out.print(temp[i] + " ");
        }
    }
    
    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        int j = 0;
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        
        arr[j++] = arr[n - 1];
        
        return j;
    }
}