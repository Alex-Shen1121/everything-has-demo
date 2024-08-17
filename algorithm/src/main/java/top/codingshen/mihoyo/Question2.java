package top.codingshen.mihoyo;

import java.util.Scanner;

/**
 * @ClassName Question2
 * @Description description
 * @Author alex_shen
 * @Date 2024/8/17 - 20:39
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), m = in.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];

        for (int i = 0; i < m; i++) {
            l[i] = in.nextInt();
            r[i] = in.nextInt();
        }

        int[] road = new int[n + 1];
        // 模拟所有员工都在的情况
        for (int i = 0; i < m; i++) {
            for (int j = l[i]; j <= r[i]; j++) {
                road[j]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            boolean flag = true;
            for (int j = l[i]; j <= r[i]; j++) {
                if (road[j] <= 1) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                ans++;
        }

        System.out.println(ans);
    }
}
