package top.codingshen.tianyiyun;

import java.util.Scanner;

/**
 * @ClassName Question2
 * @Description description
 * @Author alex_shen
 * @Date 2024/9/12 - 20:27
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caseNum = in.nextInt();
        for (int tt = 0; tt < caseNum; tt++) {
            int n = in.nextInt();
            int q = n;
            while (--q < n) {
                int round = 0;
                int sum = 0;
                while (sum < n) {
                    sum += Math.pow(q, round);
                    round++;
                }
                if (sum == n) {
                    System.out.printf("%d %d\n", round, q);
                    break;
                }
            }
        }
    }
}
