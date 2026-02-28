import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b, int[] arr) {
        int c = a + b; 
        return arr[c]; // BUG: BUFFER_OVERRUN_L3​
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(a, b, new int[10]); // BUG: BUFFER_OVERRUN_L3​
    }
}