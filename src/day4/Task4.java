package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] arrayRandom = new int[100];

        for(int i=0; i<100; i++){
            int random = (int) (Math.random() * 10001);
            arrayRandom[i]=random;
        }

        int maxSumm=0;
        int index=0;
        for(int i=0; i<100; i++){
           int tempSumm;
            if(i>0 && i<99){//так как у 0 нет предыдущего, а у 99 нет последующего
                tempSumm=arrayRandom[i-1] + arrayRandom[i-1] + arrayRandom[i+1];
                if(tempSumm>maxSumm){
                    maxSumm=tempSumm;
                    index = i-1;
                }
            }
        }

        System.out.println("Максимальная сумма: " +maxSumm);
        System.out.println("Индекс: " + index);
    }
}
