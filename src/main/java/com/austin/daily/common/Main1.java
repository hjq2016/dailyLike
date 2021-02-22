package com.austin.daily.common;

/**
 * @Description
 * @Author hjq
 * @Date 2021/1/14
 */
//计算字符串最后一个单词的长度，单词以空格隔开。
import java.util.Scanner;
public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
            String s = "ABSIB T";
            char[] chars = s.toCharArray();
            int len = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ' ') {
                    len = 0;
                    continue;
                }
                len++;
            }
            System.out.println(len);
        }
//    }
}
