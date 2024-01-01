package Recursion;

public class FriendsPairing {
    public static int findNumOfWays(int n) {
        if(n == 2 || n == 1) {
            return n;
        }

        return findNumOfWays(n-1) + ((n-1) * findNumOfWays(n-2));
    }
    public static void main(String args[]) {
        int n = 4;
        System.out.println(findNumOfWays(n));
    }
}
