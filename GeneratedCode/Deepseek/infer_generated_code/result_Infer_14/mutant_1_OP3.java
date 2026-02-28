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

        // Mutation: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code will never be executed
            System.out.println("This code is unreachable");
        }
    }
}