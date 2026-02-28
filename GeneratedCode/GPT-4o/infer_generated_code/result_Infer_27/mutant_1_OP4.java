import java.util.Scanner;

class BufferOverrunExample {

    public int showBug(int size, int index) {
        int[] buffer = new int[size];
        // Fill the buffer with some data
        for (int i = 0; i < size; i++) {
            buffer[i] = i * 2;
        }
        
        // Unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This block is never executed.");
        } else {
            // This block will always be executed
            System.out.println("This is the reachable else block.");
        }
        
        return buffer[index]; // BUG: BUFFER_OVERRUN_L3
    }
    
    // Method to simulate a condition that always returns false
    private boolean getUnreachableCondition() {
        return false;
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
    }
}