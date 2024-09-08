package top.codingshen.lingxi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Question1
 * @Description description
 * @Author alex_shen
 * @Date 2024/9/8 - 14:40
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.next().toCharArray();
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int dep = Integer.parseInt(String.valueOf(arr[i][j]));
                if (arr[i - 1][j] == 'X' || arr[i + 1][j] == 'X' || arr[i][j - 1] == 'X' || arr[i][j + 1] == 'X') {
                    continue;
                }
                if (dep >= Integer.parseInt(String.valueOf(arr[i - 1][j]))
                        && dep >= Integer.parseInt(String.valueOf(arr[i + 1][j]))
                        && dep >= Integer.parseInt(String.valueOf(arr[i][j - 1]))
                        && dep >= Integer.parseInt(String.valueOf(arr[i][j + 1])))
                    arr[i][j] = 'X';
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
