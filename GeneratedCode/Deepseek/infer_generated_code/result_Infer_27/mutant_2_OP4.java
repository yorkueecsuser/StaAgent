import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        int c = a + b; 
        int[] arr = new int[10]; // BUG: BUFFER_OVERRUN_L3​

        // Unreachable if-else statement mutation
        if (false) {
            // Unreachable code
            System.out.println("This code should not be reached!");
        } else {
            return arr[c]; // BUG: BUFFER_OVERRUN_L3​
        }

        return 0; // This is needed to avoid compilation error, as the original code is still intact and needs to compile successfully.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(a, b);
    }
}