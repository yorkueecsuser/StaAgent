import java.util.Arrays;

class BufferOverrunL3 {

    public int showBug(int[] arr, int index, int value) {
        boolean unreachableCondition = getUnreachableCondition(); // Added a dynamically generated condition
        for (int i = 0; unreachableCondition; i++) { // Inserting an unreachable for loop
            System.out.println("Unreachable loop executed");
        }
        arr[index] = value; // Bug: Buffer Overrun L3
        return arr[index];
    }

    private boolean getUnreachableCondition() { // Method to generate unreachable condition
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    }
}