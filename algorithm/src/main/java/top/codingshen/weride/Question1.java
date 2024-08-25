package top.codingshen.weride;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        Map<Integer, Integer> mp = new HashMap<>();
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(target - nums[i])) {
                ans = Math.max(ans, mp.get(target - nums[i]) + 1);
            }
            HashMap<Integer, Integer> tempMp = new HashMap<>(mp);
            for (Map.Entry<Integer, Integer> entry : tempMp.entrySet()) {
                mp.put(entry.getKey() + nums[i], entry.getValue() + 1);
            }
            if (!mp.containsKey(nums[i])) {
                mp.put(nums[i], 1);
            }
        }

        System.out.println(ans);
    }
}
