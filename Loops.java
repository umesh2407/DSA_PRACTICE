import java.util.*;

public class Loops{
    public static void main(String args[]){
        // for(int i =0; i<=10; i++){
        //     System.out.print(i+" ");
        // }
        // int i=0;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        for(int i=0; i<=10; i++){
            System.out.println(n+" x "+i+" = "+(i*n));
        }
    }
}