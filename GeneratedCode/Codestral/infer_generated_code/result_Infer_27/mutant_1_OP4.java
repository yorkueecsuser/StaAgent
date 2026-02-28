import java.util.Arrays;

class BufferOverrunL3 {

    private boolean getCondition() {
        return false;
    }

    public int showBug(int[] arr, int index, int value) {
        if (getCondition()) {
            // Unreachable if-else branch
            return -1;
        } else {
            arr[index] = value; // Bug: Buffer Overrun L3
        }
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    }
}