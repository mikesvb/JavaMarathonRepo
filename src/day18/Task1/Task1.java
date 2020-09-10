package day18.Task1;

public class Task1 {


    private static int i=0;
    private static int summ=0;
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int length = numbers.length;
        System.out.println(someMethod(numbers,length));

    }
    public static Integer someMethod(int[] num, int length){

        if(i>=length){
            return summ;
        }else{
            summ+=num[i];
            i++;
        }

        someMethod(num, length);

        return summ;
    }
}
