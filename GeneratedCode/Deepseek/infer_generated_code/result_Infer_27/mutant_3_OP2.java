import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        int c = a + b; 
        c = a + b;  // Mutation: Duplication of assignment statement
        int[] arr = new int[10]; // BUG: BUFFER_OVERRUN_L3​
        return arr[c]; // BUG: BUFFER_OVERRUN_L3​
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(a, b);
    }
}