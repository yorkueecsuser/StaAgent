import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int d, int e) {
        int f = d + e; 
        int[] arr = new int[10]; 
        return arr[f]; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int e = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(d, e);
    }
}