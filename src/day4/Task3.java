package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] arrayRandom = new int[12][8];

        int finalMaxSumm=0;
        int finalIndex=0;

        for(int i=0; i<12; i++){
            int maxSumm=0;
            for(int j=0; j<8; j++){
                int random = (int) (Math.random() * 10001);
                arrayRandom[i][j]=random;
                maxSumm+=random;
            }
            if(maxSumm>finalMaxSumm){
                finalMaxSumm=maxSumm;
                finalIndex=i;
            }
        }

        System.out.println("Индекс строки с максимальной суммой чисел: " + finalIndex);

        /*
        for(int i=0; i<12; i++) {
            System.out.println(Arrays.toString(arrayRandom[i]));
            int summForTest=0;
            for (int num : arrayRandom[i]) {
                summForTest+=num;
            }
            System.out.println(summForTest);
        }
        */
    }
}
