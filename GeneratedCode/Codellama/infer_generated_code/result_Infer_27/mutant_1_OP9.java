import java.util.Scanner;

class BufferOverrunExample {
    public int showBug(int a, int b) {
        int[] arr = new int[10];
        arr[a] = b; // BUG: Buffer Overrun L3
        return arr[0]; // BUG: Buffer Overrun L3
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BufferOverrunExample ex = new BufferOverrunExample();
        int result = ex.showBug(a, b);
        System.out.println(result);
    }

    // Mutant 1: Equivalent Loop Replacement
    public int showBugMutant1(int a, int b) {
        int[] arr = new int[10];
        arr[a] = b; // BUG: Buffer Overrun L3
        do {
            arr[a] = b; // BUG: Buffer Overrun L3
        } while (a < 10 && b < 10); // BUG: Buffer Overrun L3
        return arr[0]; // BUG: Buffer Overrun L3
    }
}