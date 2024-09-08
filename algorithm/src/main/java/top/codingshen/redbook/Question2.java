package top.codingshen.redbook;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Question2
 * @Description description
 * @Author alex_shen
 * @Date 2024/9/8 - 14:27
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

    }
}
