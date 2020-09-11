package day18.Task1;

public class Task1 {
	
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(someMethod(numbers, 0, 0));

    }
    
    public static int someMethod(int[] num, int i, int summ){
        if(i>=num.length){
        	return summ;
        }else{
        	summ+=num[i];
            i++;
            return someMethod(num, i, summ);
        }
    }
    
}
