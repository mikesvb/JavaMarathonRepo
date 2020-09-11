package day18.Task2;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(count7(717371737,0)); // 5
    }

    public static int count7(int num,int count){
        if(num%10==7){
            count++;
        }
        if(num<=0){return count;}
        num/=10;
        return count7(num, count);
    }
}
