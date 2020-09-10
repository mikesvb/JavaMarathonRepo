package day18.Task2;

public class Task2 {
    private static Integer count=0;
    public static void main(String[] args) {
        System.out.println(count7(717371737)); // 5
    }

    public static Integer count7(Integer num){

        if(num%10==7){
            count++;
        }

        if(num<=0){return count;}

        num/=10;

        count7(num);

        return count;
    }
}
