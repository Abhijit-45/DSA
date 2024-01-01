package Recursion;
import java.util.*;
public class Factorial {
    public static int factOfN(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        return n * factOfN(n-1);
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(factOfN(n));
    }
}
