package top.codingshen.xiaomi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Question1
 * @Description description
 * @Author alex_shen
 * @Date 2024/9/19 - 16:22
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt();
            int n = in.nextInt();
            int c = in.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            sum = a[0];
            int i = 0;
            while (sum < N) {
                sum += a[++i];
            }
            if (sum >= N - c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
