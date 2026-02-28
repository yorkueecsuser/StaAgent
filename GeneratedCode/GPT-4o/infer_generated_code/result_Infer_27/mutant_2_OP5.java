import java.util.Scanner;

class BufferOverrunExample {

    public int showBug(int size, int index) {
        int[] buffer = new int[size];
        // Fill the buffer with some data
        for (int i = 0; i < size; i++) {
            buffer[i] = i * 2;
        }
        
        // Unreachable switch statement, condition always evaluates to a non-matching value
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("This will never be printed either.");
                break;
            default:
                // This is still unreachable because unreachableSwitchValue is designed not to match
                System.out.println("Default case.");
        }
        
        return buffer[index]; // BUG: BUFFER_OVERRUN_L3
    }

    private int getUnreachableValue() {
        return -1; // Non-matching value for the switch cases, making them unreachable
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