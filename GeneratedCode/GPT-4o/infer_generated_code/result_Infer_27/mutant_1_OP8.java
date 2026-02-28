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

    // Mutant: Renamed variables 'size' to 'a' and 'index' to 'b'
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
            // Original method call
            int result = example.showBug(size, index);
            System.out.println("Value at index " + index + ": " + result);
            
            // Mutant method call
            int mutantResult = example.showBugMutant(size, index);
            System.out.println("Mutant Value at index " + index + ": " + mutantResult);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}