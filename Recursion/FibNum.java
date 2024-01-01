package Recursion;

public class FibNum {
    public static int fibNumIs(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return fibNumIs(n-1) + fibNumIs(n-2);
    }

    public static void main(String args[]) {
        int n = 100;
        System.out.println(fibNumIs(n));
    }
}
