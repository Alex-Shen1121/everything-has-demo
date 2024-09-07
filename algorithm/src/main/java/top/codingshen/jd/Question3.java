package top.codingshen.jd;

import java.util.Scanner;

/**
 * @ClassName Question3
 * @Description description
 * @Author alex_shen
 * @Date 2024/9/7 - 17:35
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kk = in.nextInt();
        for (int ii = 0; ii < kk; ii++) {
            int n = in.nextInt(), k = in.nextInt(), sum = in.nextInt();
            int ans = 0;
            int maxTarget = sum / k;
            for (int i = maxTarget; i <= n; i++) {
                ans += i - maxTarget;
            }
            System.out.println(ans - (sum % k == 0 ? 0 : sum - maxTarget * k));
        }
    }
}
