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
        
        // Mutation code for Unreachable for loop
        boolean unreachableForLoop = getCondition();
        for (int i = 0; unreachableForLoop; i++) {
            // An unreachable statement
            System.out.println("This statement is unreachable in the original code.");
        }
    }
    
    // Helper method to generate a random boolean value.
    private boolean getCondition() {
        return Math.random() < 0.5;
    }
}