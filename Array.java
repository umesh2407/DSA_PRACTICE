// import java.util.*;

// public class Array {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter size of array:    ");
//       int n = sc.nextInt();
//       int nums[] = new int[n];

//       //input
//       for (int i = 0; i < n; i++) {
//          nums[i] = sc.nextInt();
//       }
//       System.out.print("Searching for? ");
//       int x = sc.nextInt();

//       //output
//       for (int i = 0; i < n; i++) {
//          if (nums[i] == x) {
//             System.out.println("The index of " + x + "is" + i);
//          }
//       }
//    }
// }

//2D ARRAY 
import java.util.*;

public class Array {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of row , column");
      int rows = sc.nextInt();
      int cols = sc.nextInt();
      int[][] marks = new int[rows][cols];

      // input marks
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            marks[i][j] = sc.nextInt();
         }
      }

      System.out.println("Enter the number to find :");
      int x = sc.nextInt();

      // output marks
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            if (marks[i][j] == x) {
               System.out.println("Index of provided number is :" + i + " " + j);
            }
         }
      }

   }
}