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

        // Mutant code
        boolean condition = false;
        if (condition == false) {
            // Adding an unreachable branch for the mutation operator.
            // This branch will never be executed.
        }
    }
}