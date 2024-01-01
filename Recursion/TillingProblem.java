package Recursion;

public class TillingProblem {
    public static int noOfWays(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        return noOfWays(n-1) + noOfWays(n-2);
    }
    public static void main(String args[]) {
        int n = 1;

        System.out.println(noOfWays(n));
    }
}
