package Recursion;

public class BinaryString {

    public static void printAllStrings(int n, int lastplace, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }

        printAllStrings(n-1,0, str+"0");

        if(lastplace == 0) {
            printAllStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]) {
        int n = 2;
        printAllStrings(n, 0, "");
    }
}
