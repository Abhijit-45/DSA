package Recursion;

public class FirstOccurance {
    public static int checkFirst(int key, int i, int arr[]) {
        if(i == arr.length) {
            return -1;
        }

        if(arr[i] == key) {
            return i;
        }

        return checkFirst(key, i+1, arr);
    }

    public static int checkLast(int key, int i, int arr[]) {
        if(i == arr.length) {
            return -1;
        }

        int idx = checkLast(key, i+1, arr);
         
        if(idx == -1 && arr[i] == key) {
            return i;
        }

        return idx;
    }

    public static void allOccurance(int arr[], int i, int key) {
        if(i == arr.length) {
            return;
        }

        if(arr[i] == key) {
            System.out.print(i + " ");
        }

        allOccurance(arr, i+1, key);
    }
    public static void main(String args[]) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // System.out.println(checkFirst(5, 0, arr));
        // System.out.println(checkLast(5, 0, arr));
        allOccurance(arr, 0, 2);
    }
}
