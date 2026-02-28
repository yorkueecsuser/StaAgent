import java.util.Arrays;

class BufferOverrunL3 {

    public int showBug(int[] arr, int index, int value) {
        boolean shouldRun = getCondition(); // Added method call to dynamically determine the condition
        if (shouldRun) {
            arr[index] = value; // Original code
        } else {
            // Unreachable if-else branch
            System.out.println("This code is unreachable");
        }
        return arr[index];
    }

    // Dummy method to simulate dynamically determining the condition
    public boolean getCondition() {
        return false; // Always return false to make the branch unreachable
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    }
}