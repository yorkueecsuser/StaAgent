import java.util.Scanner;

class IntegerOverflowExample {

    private boolean condition = false;

    public int showBug(int a, int b) {
        int c = a + b; 
        int[] arr = new int[10]; // BUG: BUFFER_OVERRUN_L3​
        if (condition) {
            return arr[c]; // BUG: BUFFER_OVERRUN_L3​
        }
        return 0; // This ensures that the code is unreachable
    }

    public boolean getCondition() {
        return this.condition;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(a, b);
    }
}