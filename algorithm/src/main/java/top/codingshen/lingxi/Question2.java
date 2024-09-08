package top.codingshen.lingxi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Question2
 * @Description description
 * @Author alex_shen
 * @Date 2024/9/8 - 14:54
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 找到最三大的数字
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        if (n < 3) {
            // 输出最大值
            Arrays.sort(arr);
            System.out.println(arr[n - 1]);
        } else {
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int max3 = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] == max1 || arr[i] == max2 || arr[i] == max3) {
                    continue;
                }
                if (arr[i] > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = arr[i];
                } else if (arr[i] > max2) {
                    max3 = max2;
                    max2 = arr[i];
                } else if (arr[i] > max3) {
                    max3 = arr[i];
                }
            }
            System.out.println(max3);
        }

    }
}
