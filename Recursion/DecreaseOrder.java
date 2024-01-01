package Recursion;

public class DecreaseOrder {
    public static void decreaseOrder(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        decreaseOrder(n-1);
    }

    public static void increaseOrder(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        increaseOrder(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]) {
        int n = 5;
        decreaseOrder(n);
        System.out.println();
        increaseOrder(n);
    }
}
