package top.codingshen.mihoyo;

import java.util.Scanner;

/**
 * @ClassName Question1
 * @Description description
 * @Author alex_shen
 * @Date 2024/8/17 - 20:18
 */
public class Question1 {
    /**
     * 为了抽到心爱的五星角色，米小游需要至少几颗原石。
     * 目前米小游手里没有任何的原石，距离卡池结束还有m天。
     * 原石有两种获取方式，一种是充小月卡，另一种是直接买。
     * 1。充一次月卡需要 30块钱，可以增加 30 天的祝福次数，每天只能领一次祝福（90原石），购买当天可额外领取 300原石。
     * 2。直接买则是1 块钱 10 原石。
     * 为了尽可能省钱，他希望你帮他求出最少的花费。
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), m = in.nextInt();
        int cnt = 0;

        while (m >= 30) {
            // 买月卡
            n -= 300 + 90 * 30;
            m -= 30;
            cnt += 30;
        }

        if (n > 300) {
            // 买一次月卡
            cnt += 30;
            n -= 300 + 90 * m;

            if (n > 0)
                cnt += (n + 9) / 10;
        } else {
            // n/10向上取整
            cnt += (n + 9) / 10;
        }

        System.out.println(cnt);
    }
}
