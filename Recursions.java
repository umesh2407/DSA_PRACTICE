public class Recursions {

    public static void printSumOfNum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum =  sum +i;
        printSumOfNum(i+1, n, sum);
    }

    public static void main(String[] args) {
        printSumOfNum(1, 5, 0);
    }
}
