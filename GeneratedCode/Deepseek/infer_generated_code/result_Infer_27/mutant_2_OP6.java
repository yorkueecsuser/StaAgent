import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        int c = a + b;
        int[] arr = new int[10]; // BUG: BUFFER_OVERRUN_L3​
        for(int i=0; i<10; i++) { // Unreachable for loop mutation
            System.out.println("This code is unreachable.");
        }
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