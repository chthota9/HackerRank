import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int length = arr.length;
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1 ){
                pos++;
            }
            if(arr[i]<= -1 ) {
                neg++;
            }
            if(arr[i] == 0 ){
                zero++;
            }
        }
        float finalpos = ((float)pos/length);
        float finalneg = ((float)neg/length);
        float finalzero = ((float)zero/length);
        System.out.println(finalpos);
        System.out.println(finalneg);
        System.out.println(finalzero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}