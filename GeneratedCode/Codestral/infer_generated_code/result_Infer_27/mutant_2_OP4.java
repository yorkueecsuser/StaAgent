import java.util.Arrays;

class BufferOverrunL3 {

    public int showBug(int[] arr, int index, int value) {
        arr[index] = value; // Bug: Buffer Overrun L3

        // Mutant code: Unreachable if-else statement
        boolean shouldRun = falseCondition();
        if (shouldRun) {
            // Unreachable code
            int a = 10 / 0; // This line will cause a division by zero error
        } else {
            // Alternative code
            System.out.println("This code will never be executed.");
        }

        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    }

    private static boolean falseCondition() {
        return false;
    }
}