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

    // Mutant Code: Renamed variables in the mutated method
    public int showBugMutant(int a, int b) {
        int[] buffer = new int[a];
        // Fill the buffer with some data
        for (int i = 0; i < a; i++) {
            buffer[i] = i * 2;
        }
        return buffer[b]; // BUG: BUFFER_OVERRUN_L3
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

        // Using the mutated method
        try {
            int resultMutant = example.showBugMutant(size, index);
            System.out.println("Mutant Value at index " + index + ": " + resultMutant);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Mutant Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}