import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sum = 0;
        long minnum = arr[0];
        long maxnum = arr[0];
        long min = 0;
        long max = 0;

        for(int i = 0; i< arr.length; i++) {
            sum = sum + arr[i];
         if(arr[i] <= minnum) {
             minnum = arr[i];
         }
         if(arr[i] > maxnum) {
             maxnum = arr[i];
         }
        }
        max = sum - minnum;
        min = sum - maxnum;
        // System.out.println(sum);
        // System.out.println(maxnum);
        // System.out.println("minnum" + minnum);
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}