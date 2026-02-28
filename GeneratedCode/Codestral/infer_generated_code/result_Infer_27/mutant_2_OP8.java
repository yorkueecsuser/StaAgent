import java.util.Arrays;

class BufferOverrunL3 {

    public int showBug(int[] arr, int index, int value) {
        arr[index] = value; // Bug: Buffer Overrun L3
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        int a = 11; // New variable 'a' replaces the original '11'
        int v = 123; // New variable 'v' replaces the original '123'
        ex.showBug(arr, a, v); // Using the new variables
    }
}