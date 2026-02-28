import com.facebook.infer.annotation.*;

class BufferOverrunExample {

    @PerformanceCritical
    public int showBug(int index) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        
        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            arr[0] = -1; // Mutant code
        } else {
            // Alternative code that also should never execute
            arr[9] = -2; // Mutant code
        }
        
        return arr[index]; // BUG: BUFFER_OVERRUN_L3
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        BufferOverrunExample ex = new BufferOverrunExample();
        ex.showBug(15); // This will cause a buffer overrun
    }
}