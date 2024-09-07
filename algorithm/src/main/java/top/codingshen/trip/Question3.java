package top.codingshen.trip;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName Question3
 * @Description description
 * @Author alex_shen
 * @Date 2024/9/5 - 20:08
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();

        int count = 0;
        Set<Character> targetSet = new HashSet<>();
        for (int j = 0; j <= n; j++) {
            targetSet.add((char) ('0' + j));
        }

        // 计算起始和结束范围
        int start = Math.max(k, (int) Math.pow(10, m - 1));
        int end = (int) Math.pow(10, m);

        // 创建一个可重用的集合
        Set<Character> set = new HashSet<>();

        for (int i = start; i < end; i++) {
            char[] charArray = String.valueOf(i).toCharArray();
            set.clear();

            for (char c : charArray) {
                set.add(c);
            }

            if (set.size() == m && targetSet.containsAll(set)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
