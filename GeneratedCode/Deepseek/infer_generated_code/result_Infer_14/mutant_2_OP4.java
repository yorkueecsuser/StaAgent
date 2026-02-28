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

        // Added Mutation Operator: Unreachable if-else statement
        boolean shouldNotExecute = true;
        if (shouldNotExecute) {
            // This code block will never be executed
            System.out.println("This will never be printed");
        } else {
            // This code block ensures that both the 'if' and 'else' blocks are reachable
            System.out.println("This will always be printed");
        }
    }
}