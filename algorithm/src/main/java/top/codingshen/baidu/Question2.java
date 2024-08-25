package top.codingshen.baidu;

import java.util.Scanner;

/**
 * @ClassName Question2
 * @Description description
 * @Author alex_shen
 * @Date 2024/8/25 - 20:07
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt(), b = in.nextInt();
            char ch = in.next().charAt(0);

            if (ch == '+' || ch == '*') {
                System.out.println("=");
            } else if (ch == '-') {
                if (a > b) {
                    System.out.println(">");
                } else if (a < b) {
                    System.out.println("<");
                } else {
                    System.out.println("=");
                }
            } else if (ch == '/') {
                if (a > b) {
                    System.out.println(">");
                } else if (a < b) {
                    System.out.println("<");
                } else {
                    System.out.println("=");
                }
            } else if (ch == '^') {
                if (a == b) {
                    System.out.println("=");
                } else {
                    System.out.println(b * Math.log(a) > a * Math.log(b) ? ">" : "<");
                }
            }
        }
    }
}
