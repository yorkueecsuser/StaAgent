import java.util.Arrays;

class BufferOverrunL3 {

    private boolean getCondition() {
        return false;
    }

    public int showBug(int[] arr, int index, int value) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop mutant
            System.out.println("This line should never be executed");
        }
        arr[index] = value; // Bug: Buffer Overrun L3
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    }
}