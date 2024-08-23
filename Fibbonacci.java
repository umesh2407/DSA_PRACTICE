public class Fibbonacci{

    public static void fibonnaciseries(int a, int b, int n){
    if(n>0){
        int c = a+b;
        a=b;
        b=c;
        System.out.print(" "+c);
        fibonnaciseries(a, b, n-1);
    }}
    public static void main(String[] args) {
        int a= 0;
        int b= 1;
        int n = 10;
    System.out.print(a+" "+b);

fibonnaciseries(a, b, n-2);
    }
}

