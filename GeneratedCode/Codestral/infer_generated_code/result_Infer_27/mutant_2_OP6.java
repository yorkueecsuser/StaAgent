import java.util.Arrays;

class BufferOverrunL3 {

    public int showBug(int[] arr, int index, int value) {
        // Unreachable for loop mutant
        for (int i = 0; getCondition(); i++) {
            System.out.println("This code is unreachable");
        }

        arr[index] = value; // Bug: Buffer Overrun L3
        return arr[index];
    }

    public static boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    }
}