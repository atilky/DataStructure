package ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 統計全國每個年齡有多少人,不能用map
 */
public class ch2 {

    public static void main(String[] args) {

        List<Integer> ageS = Arrays.asList(1, 5, 6, 2, 2, 8, 7, 5, 2, 3, 2, 1, 0, 2, 8, 3, 3, 4, 5, 8, 7, 8, 10, 10, 5, 10, 9, 6, 9, 8, 6, 5, 7);

        System.out.println(test1(ageS));
    }

    public static List<Integer> test1(List<Integer> ageS){

        ArrayList<Integer> ageStatistics = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            ageStatistics.add(i, 0);
        }

        for (Integer age : ageS) {
            Integer getAge = ageStatistics.get(age) + 1;
            ageStatistics.set(age, getAge);
        }

        return ageStatistics;
    }




}
