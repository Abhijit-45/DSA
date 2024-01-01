package Recursion;

public class IntToString {

    static String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void convertToString(int num) {
        if(num == 0) {
            return;
        }

        int lastdigit = (num%10);
        convertToString(num/10);
        System.out.print(arr[lastdigit] + " ");
    }
    public static void main(String args[]) {
        int num = 2010;
        convertToString(num);
    }
}
