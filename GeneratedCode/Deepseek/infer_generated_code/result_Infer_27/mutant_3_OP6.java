import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        int c = a + b; 
        int[] arr = new int[10];
        
        // Adding an unreachable for loop
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This is an unreachable loop.");
        }

        return arr[c];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(a, b);
    }
}