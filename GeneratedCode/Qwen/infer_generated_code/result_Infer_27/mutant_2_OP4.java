import com.facebook.infer.annotation.*;

class BufferOverrunExample {

    @PerformanceCritical
    public int showBug(int index) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        
        // Mutant code: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            arr[index] = -1; // Dummy operation to avoid empty block warning
        } else {
            // Alternative code
            arr[index] = -2; // Another dummy operation
        }
        
        return arr[index]; // BUG: BUFFER_OVERRUN_L3
    }

    public static void main(String[] args) {
        BufferOverrunExample ex = new BufferOverrunExample();
        ex.showBug(15); // This will cause a buffer overrun
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically
    }
}