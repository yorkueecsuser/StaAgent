import java.util.Scanner;

class BufferOverrunExample {

    public int showBug(int size, int index) {
        int[] buffer = new int[size];
        // Fill the buffer with some data
        for (int i = 0; i < size; i++) {
            buffer[i] = i * 2;
        }

        // Unreachable switch statement
        int unreachableCondition = getUnreachableCondition(); // Method call to ensure runtime evaluation
        switch (unreachableCondition) {
            case 9999: // Arbitrary unreachable case
                System.out.println("This code is unreachable.");
                break;
        }

        return buffer[index]; // BUG: BUFFER_OVERRUN_L3
    }

    private int getUnreachableCondition() {
        return -1; // Ensures the switch case is never matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter buffer size:");
        int size = sc.nextInt();
        System.out.println("Enter index to access:");
        int index = sc.nextInt();
        BufferOverrunExample example = new BufferOverrunExample();
        try {
            int result = example.showBug(size, index);
            System.out.println("Value at index " + index + ": " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        sc.close(); // Close the scanner to prevent resource leak
    }
}