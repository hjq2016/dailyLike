package com.austin.daily.common;

/**
 * @Description
 * @Author hjq
 * @Date 2021/1/14
 */
//写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写。
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();

            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char[] chars = s1.toCharArray();
            char[] chars1 = s2.toCharArray();
            int len = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == chars1[0]) {
                    len++;
                }
            }
            System.out.println(len);
        }
    }
}
