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
     * 學習 Two Point
     * @param args
     */
    public static void main(String[] args) {
        int [] num = {0, 0, 0, 1, 2, 2, 3, 3, 4, 4};
//        int len = case1(num);
        int case2 = case2(num);
        System.out.println(case2);
    }

    /**
     * 1.slow位置元素跟quick位置元素 相同, quick往後指
     * 2.slow位置元素跟quick位置元素 不同, slow + 1位置元素 = quick位置元素, 然後兩個指針一起向後
     * @return slow 指針位置 + 1
     * 時間複雜度O(n), 空間複雜度O(1)
     */
    public static int case2(int [] num){

        int slow = 0;
        for (int quick = 1; quick < num.length; quick++) {
            if (num[slow] != num[quick]){
                num[slow+1] = num[quick];
                slow++;
            }
        }

        return slow + 1;
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
