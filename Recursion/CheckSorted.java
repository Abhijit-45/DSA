package Recursion;

public class CheckSorted {
    public static boolean check(int i, int arr[]) {
        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }
         
        return check(i+1, arr);
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 6, 5, 6};
        System.out.println(check(0, arr));
    }
}
