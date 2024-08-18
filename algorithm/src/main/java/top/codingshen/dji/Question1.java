package top.codingshen.dji;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Question1 {

    /* Write Code Here */
    public static int numberOfPatrolBlocks(int[][] block) {
        // 上-3 下-1 左-2 右-0
        int row = block.length;
        int col = block[0].length;
        int dir = 0;
        int i = 0, j = 0;
        Set<List<Integer>> set = new HashSet<>();
        while (!set.contains(Arrays.asList(i, j, dir))) {
            set.add(Arrays.asList(i, j, dir));
            if (dir == 0 && j < col - 1 && block[i][j + 1] != 1) {
                j += 1;
                continue;
            } else if (dir == 1 && i < row - 1 && block[i+ 1][j] != 1) {
                i += 1;
                continue;
            } else if (dir == 2 && j > 0 && block[i][j - 1] != 1) {
                j -= 1;
                continue;
            } else if (dir == 3 && i > 0 && block[i - 1][j] != 1) {
                i -= 1;
                continue;
            }
            dir = (dir + 1) % 4;
        }
        Set<List<Integer>> set2 = new HashSet<>();
        for (List<Integer> s : set) {
            set2.add(Arrays.asList(s.get(0), s.get(1)));
        }

        return set2.size();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int block_rows = 0;
        int block_cols = 0;
        block_rows = in.nextInt();
        block_cols = in.nextInt();

        int[][] block = new int[block_rows][block_cols];
        for (int block_i = 0; block_i < block_rows; block_i++) {
            for (int block_j = 0; block_j < block_cols; block_j++) {
                block[block_i][block_j] = in.nextInt();
            }
        }

        if (in.hasNextLine()) {
            in.nextLine();
        }


        res = numberOfPatrolBlocks(block);
        System.out.println(String.valueOf(res));

    }
}
