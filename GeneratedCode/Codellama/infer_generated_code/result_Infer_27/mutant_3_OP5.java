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

// Mutant 1: Unreachable switch statement
public int showBug(int a, int b) {
    int[] arr = new int[10];
    arr[a] = b; // BUG: Buffer Overrun L3
    int value = getValue();
    switch (value) {
        case 1:
            return arr[0]; // BUG: Buffer Overrun L3
        default:
            return 0;
    }
}

// Mutant 2: If-Else statement with unreachable else block
public int showBug(int a, int b) {
    int[] arr = new int[10];
    arr[a] = b; // BUG: Buffer Overrun L3
    boolean shouldRun = getCondition();
    if (shouldRun) {
        return arr[0]; // BUG: Buffer Overrun L3
    } else {
        return 0;
    }
}

// Mutant 3: While loop with unreachable body
public int showBug(int a, int b) {
    int[] arr = new int[10];
    arr[a] = b; // BUG: Buffer Overrun L3
    boolean shouldRun = getCondition();
    while (shouldRun) {
        return arr[0]; // BUG: Buffer Overrun L3
    }
    return 0;
}

// Mutant 4: For loop with unreachable body
public int showBug(int a, int b) {
    int[] arr = new int[10];
    arr[a] = b; // BUG: Buffer Overrun L3
    boolean shouldRun = getCondition();
    for (int i = 0; shouldRun; i++) {
        return arr[0]; // BUG: Buffer Overrun L3
    }
    return 0;
}