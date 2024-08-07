import java.util.*;
public class Array {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
System.out.print("Enter size of array:    ");
int n= sc.nextInt();
int nums[] = new int[n];
for(int i=0; i<n; i++){
nums[i]=sc.nextInt();
}
System.out.print("Searching for? ");
int x = sc.nextInt();

for(int i=0; i<n; i++){
 if(nums[i] == x){
    System.out.println("The index of "+x+"is"+i);
 }
    }
    }
}
