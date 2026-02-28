import java.util.Arrays;

class BufferOverrunL3 {

    public int showBug(int[] arr, int index, int value) {
        int a = arr; // Renamed variable arr to a
        a[index] = value; // Bug: Buffer Overrun L3
        return a[index];
    }

    public static void main(String[] args) {
        int[] a = new int[10]; // Renamed variable arr to a
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(a, 11, 123); // Accessing index 11 which is out of bounds
    }
}