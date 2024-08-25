package top.codingshen.baidu;

import java.util.Scanner;

/**
 * @ClassName Question1
 * @Description description
 * @Author alex_shen
 * @Date 2024/8/25 - 19:51
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s1 = in.next(), s2;
        for (int i = 1; i < n; i++) {
            s2 = in.next();
            String[] prev = s1.split(":");
            String[] cur = s2.split(":");
            if (convert(prev) <= convert(cur)) {
                int gap = convert(cur) - convert(prev);
                System.out.println((float) gap / 60);
            } else {
                int gap = convert(cur) - convert(prev) + 24 * 60 * 60;
                System.out.println((float) gap / 60);
            }

            s1 = s2;
        }
    }

    public static int convert(String[] str) {
        return Integer.parseInt(str[0]) * 3600 + Integer.parseInt(str[1]) * 60 + Integer.parseInt(str[2]);
    }
}
