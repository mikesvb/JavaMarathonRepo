package day8.Task1;

public class Task1 {
    public static void main(String[] args) {
        String string="";
        long st, en;
        st = System.nanoTime();
        for(int i=0; i<=20000; i++){
            string += i+ " ";
        }
        en = System.nanoTime();
        System.out.println(string);
        System.out.println("-------------");
        System.out.println(en - st);
        System.out.println("-------------\n\n");
        StringBuilder sb = new StringBuilder();
        st = System.nanoTime();
        for(int i=0; i<=20000; i++){
            sb.append(i+ " ");
        }
        en = System.nanoTime();
        System.out.println(sb);
        System.out.println("-------------");
        System.out.println(en - st);
        System.out.println("-------------\n\n");
    }
}
