package Recursion;

public class Power {
    public static int getNToPow(int n, int pow) {
        if(pow == 1) {
            return n;
        }

        return n * getNToPow(n, pow-1);
    }

    public static int optimizedGetNToPow(int n, int pow) {
        if(pow == 1) {
            return n;
        }

        int halfPow = optimizedGetNToPow(n, pow/2);

        if(pow%2 == 0) {
            return halfPow * halfPow;
        } else {
            return n * halfPow * halfPow;
        }
    }
    public static void main(String args[]) {
        int pow = 5;
        int n = 2;
        System.out.println(getNToPow(n, pow));
        System.out.println(optimizedGetNToPow(n, pow));
    }
}
