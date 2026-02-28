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

// Mutated code below

public int showBug(int a, int b) {
    int[] arr = new int[10];
    arr[a] = b; // BUG: Buffer Overrun L3
    return arr[0]; // BUG: Buffer Overrun L3
}

public void unreachableSwitch(int value) {
    switch (value) {
        case 1:
            System.out.println("Never reach here");
            break;
        default:
            System.out.println("Default case");
            break;
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    BufferOverrunExample ex = new BufferOverrunExample();
    int result = ex.showBug(a, b);
    System.out.println(result);
    ex.unreachableSwitch(0);
}