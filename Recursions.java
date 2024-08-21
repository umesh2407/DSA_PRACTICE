// public class Recursions {
 
//     public static void printSumOfNum(int i, int n, int sum) {
//         if (i == n) {
//             sum = sum + i;
//             System.out.println(sum);
//             return;
//         }
//         sum =  sum +i;
//         printSumOfNum(i+1, n, sum);
//     }

//     public static void main(String[] args) {
//         printSumOfNum(1, 5, 0);
//     }
// }

//Factorial program
import java.util.*;
public class Recursions{

    public static int Factorial(int n){
if(n == 1 || n==0){
   return 1;
}
  int ans = n * Factorial(n-1);
return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a =  sc.nextInt();
        int fact = Factorial(a);
        System.out.println(fact);
    }
}