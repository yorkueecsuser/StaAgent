import java.util.Arrays;

class BufferOverrunL3 {

    public int showBug(int[] arr, int index, int value) {
        arr[index] = value; // Bug: Buffer Overrun L3

        // Unreachable switch statement mutation
        boolean condition = false;
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                if (condition) {
                    System.out.println("This code is unreachable");
                }
                break;
        }

        return arr[index];
    }

    private int getUnreachableValue() {
        return 0;  // Always returns 0 to make the switch statement unreachable
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    }
}