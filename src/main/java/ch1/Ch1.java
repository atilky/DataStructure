package ch1;

import java.util.Arrays;
import java.util.List;


public class Ch1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 6, 8, 9, 12, 14, 36, 16, 1, 0);
        for (Integer integer : list) {
            System.out.println(integer + ":" + test1(integer));
        }
    }

    /**
     * 判斷一個數是否為2的N次方
     */
    private static boolean test2(Integer n){
        return n > 0 && (n & n - 1) == 0;
    }

    private static boolean test1(Integer n){
        if (n <= 1) return false;
        while (n > 1){
            if(n % 2 != 0) {
                return false;
            }
            n = n / 2 ;
        }
        return true;
    }

}
