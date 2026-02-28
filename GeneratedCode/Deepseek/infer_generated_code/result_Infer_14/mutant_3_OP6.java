import android.annotation.SuppressLint;
import androidx.annotation.UiThread;

class StarvationBug {
    @SuppressLint("STARVATION")
    @UiThread
    public void showBug() {
        // BUG: STARVATION
        try {
            Thread.sleep(10000); // Intentionally sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mutated Code: Insert Unreachable For Loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            // This code will be added as an unreachable loop to maintain the original code.
        }
    }

    // Method to get the condition
    private boolean getCondition() {
        return false;
    }
}