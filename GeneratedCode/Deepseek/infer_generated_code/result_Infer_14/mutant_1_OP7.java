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

        // Mutant Code: Unreachable While Loop
        boolean condition = false; 
        while (condition) {
            // Unreachable code
            // This will make the while loop unreachable, hence creating a mutation
            // This is to avoid unreachable statement error
        }
    }
}