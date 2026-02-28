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

        // MUTANT: UNREACHABLE WHILE LOOP
        boolean condition = false;
        while (condition) {
            // intentionally empty to make the loop unreachable
        }
    }
}