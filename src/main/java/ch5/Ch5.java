package ch5;

import java.util.ArrayList;
import java.util.List;

/**
 * 删除排序数组中的重复项
 * 一個有序數組 nums ，原地刪除重復出現的元素，使每個元素只出現一次 ，返回刪除後數組的新長度。
 * 不要使用額外的數組空間，必須在原地修改輸入數組並在使用 O(1) 額外空間的條件下完成
 */
public class Ch5 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int [] num = {0, 0, 0, 1, 2, 2, 3, 3, 4, 4};
        int len = case1(num);
        System.out.println(len);
    }

    /**
     * input [0, 1, 2, 2, 3, 3, 4, 4]
     * output [5]
     */
    public static int case1(int [] num){

        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        int orgLength = num.length;
        int length = num.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if(num[i] != num[j]){
                    count ++;
                    num[j] = num[j + 1];
                }
            }
        }

        return orgLength - count;
    }

}
