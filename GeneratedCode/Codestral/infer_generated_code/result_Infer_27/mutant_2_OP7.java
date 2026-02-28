import java.util.Arrays;

class BufferOverrunL3 {

    public int showBug(int[] arr, int index, int value) {
        // Mutant: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            int x = 10; // This code will never be executed
        }
        // End of Mutant
        arr[index] = value; // Bug: Buffer Overrun L3
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    }
}