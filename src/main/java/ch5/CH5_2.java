package ch5;

import java.util.Arrays;

public class CH5_2 {


    /**
     * 尋找數組的中心索引
     * 數組中某一個下標，左右兩邊的元素相加之後相等，該下標即為中心索引
     * 思路：先統計出整個數組的總和，然後從第一個元素開始疊加
     * 總和遞減當前元素，疊加遞增當前元素，直到兩個值相等
     */
    public static void main(String[] args) {

        int [] num1 = {10, 8, 0, 1, 5, 2, 3, 12, 7, 2};
        int [] num2 = {1, 7, 3, 6, 5, 6};
        System.out.println(case1(num2));

    }

    public static int case1(int [] num){

        int total = Arrays.stream(num).sum();
        int beginTotal = 0;
        for (int i = 0; i < num.length; i++) {
            if(beginTotal == total - beginTotal - num[i]) return i;
            beginTotal = beginTotal + num[i];
        }


        return -1;
    }


}
