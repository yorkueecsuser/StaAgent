import java.util.Scanner;

class BufferOverrunExample {

    public int showBug(int size, int index) {
        int[] buffer = new int[size];
        // Fill the buffer with some data
        for (int i = 0; i < size; i++) {
            buffer[i] = i * 2;
        }
        return buffer[index]; // BUG: BUFFER_OVERRUN_L3
    }

    // Mutant method with a renamed variable
    public int showBugMutant(int s, int index) {
        int[] buffer = new int[s];
        // Fill the buffer with some data
        for (int i = 0; i < s; i++) {
            buffer[i] = i * 2;
        }
        return buffer[index]; // BUG: BUFFER_OVERRUN_L3
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

            // Using the mutant method
            int resultMutant = example.showBugMutant(size, index);
            System.out.println("Value at index (mutant) " + index + ": " + resultMutant);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}