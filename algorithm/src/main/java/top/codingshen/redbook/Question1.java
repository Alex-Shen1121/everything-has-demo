package top.codingshen.redbook;

import java.util.Scanner;

/**
 * @ClassName Question1
 * @Description description
 * @Author alex_shen
 * @Date 2024/9/8 - 14:13
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        char[][] maxtrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            maxtrix[i] = in.next().toCharArray();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean[][] tmp = new boolean[n][m];
                int row = i, col = j;
                while ((row >= 0 && row < n && col >= 0 && col < m) && !tmp[row][col]) {
                    tmp[row][col] = true;
                    if (maxtrix[row][col] == 'L') {
                        col--;
                    } else if (maxtrix[row][col] == 'R') {
                        col++;
                    } else if (maxtrix[row][col] == 'U') {
                        row--;
                    } else if (maxtrix[row][col] == 'D') {
                        row++;
                    }
                }
                if (!(row < 0 || row >= n || col < 0 || col >= m)) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
