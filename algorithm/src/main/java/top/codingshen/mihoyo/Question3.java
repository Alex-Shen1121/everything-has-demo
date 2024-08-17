package top.codingshen.mihoyo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName Question3
 * @Description description
 * @Author alex_shen
 * @Date 2024/8/17 - 20:53
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (map.containsKey(arr[i])) {
                map.get(arr[i]).add(i);
            } else {
                map.put(arr[i], new ArrayList<>());
                map.get(arr[i]).add(i);
            }
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int l = in.nextInt() - 1, r = in.nextInt() - 1, x = in.nextInt();
            if (!map.containsKey(x)) {
                System.out.println(0);
                return;
            }

            List<Integer> locations = map.get(x);
            locations = locations.stream().filter(xx -> xx >= l && xx <= r).collect(Collectors.toList());

            int ans = 0;
            for (int ll = l; ll <= r; ll++) {
                for (int rr = l; rr <= r; rr++) {
                    final int left = ll;
                    final int right = rr;
                    long count = locations.stream()
                            .filter(xxx -> xxx >= left && xxx <= right)
                            .count();
                    if (count > 0) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }

    }
}

