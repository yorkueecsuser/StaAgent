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
}

/*
 * The following is the mutated code for the Renaming mutation operator.
 * The variable 'arr' has been renamed to 'a' and the variable 'b' has been
 * renamed to 'c'.
 */
class BufferOverrunExample {
    public int showBug(int a, int c) {
        int[] a = new int[10];
        a[a] = c; // BUG: Buffer Overrun L3
        return a[0]; // BUG: Buffer Overrun L3
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();
        BufferOverrunExample ex = new BufferOverrunExample();
        int result = ex.showBug(a, c);
        System.out.println(result);
    }
}