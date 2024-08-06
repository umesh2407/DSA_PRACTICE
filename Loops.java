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
        int sum=0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum is:"+sum);
    }
}