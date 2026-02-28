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

        boolean condition = getCondition();
        if (condition) {
            // Mutant code - unreachable for loop
            for (int i = 0; i < 10; i++) {
                // Do nothing
            }
        }
    }

    private boolean getCondition() {
        return false;
    }
}