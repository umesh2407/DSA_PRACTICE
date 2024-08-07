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

for(int i=0; i<n; i++){
  System.out.println(nums[i]);
    }

    }
}
