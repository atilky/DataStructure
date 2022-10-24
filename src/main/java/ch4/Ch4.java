package ch4;

public class Ch4 {

    /**
     * 找出質數
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(primeNumberCount(100));
        System.out.println(primeNumberCount2(100));

    }

    /**
     * 埃氏篩
     */
    public static int primeNumberCount2(int number){
        int count = 0;
        boolean[] e = new boolean[number];
        for (int i = 2; i < number; i++) {
            if (!e[i]){
                count++;
                for (int j = i * i; j < number; j = j + i) {
                    e[j] = true;
                }
            }
        }



        return count;
    }

    public static int primeNumberCount(int number){

        int count = 0;
        for (int i = 2; i < number; i++) {
            if(primeNumber(i)){
                count++;
            };
        }

        return count;
    }


    public static boolean primeNumber(int i){

        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0){
                return false;
            }
        }

        return true;
    }

}
