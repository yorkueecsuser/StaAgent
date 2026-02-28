import com.facebook.infer.annotation.*;

class BufferOverrunExample {

    @PerformanceCritical
    public int showBug(int index) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        
        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            arr[index] = -1; // Some arbitrary operation
        }
        
        return arr[index]; // BUG: BUFFER_OVERRUN_L3
    }

    public static void main(String[] args) {
        BufferOverrunExample ex = new BufferOverrunExample();
        ex.showBug(15); // This will cause a buffer overrun
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}