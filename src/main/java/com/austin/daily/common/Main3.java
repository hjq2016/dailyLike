package com.austin.daily.common;

/**
 * @Description
 * @Author hjq
 * @Date 2021/1/14
 */
/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int n = Integer.valueOf(in.nextLine());
            if (n == 0) {
                continue;
            }
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i< n;i++) {
                list.add(Integer.valueOf(in.nextLine()));
            }
            List<Integer> list1 = quickSort(list);
            for (Integer i : list1) {
                System.out.println(i);
            }
        }

    }

    private static List<Integer> quickSort(List<Integer> list) {
        List<Integer> list1 = list.stream().sorted((a, b) -> {
            if (a.equals(b)) {
                return 0;
            }
            return a > b ? 1 : -1;
        }).collect(Collectors.toList());
        int current = 0;

        Iterator<Integer> ite = list1.iterator();
        int pre = ite.next();
        while (ite.hasNext()) {
            current = ite.next();
            if (current == pre) {
                ite.remove();
                continue;
            }
            pre = current;
        }
        return list1;
    }
}
