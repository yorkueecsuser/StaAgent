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
        
        // Mutation Operator: Unreachable if-else statement
        if (false) {
            // This code will never execute due to the false condition
            System.out.println("This code is unreachable due to the false condition.");
        } else {
            // This is the alternative code that will execute
            System.out.println("This is the alternative code that will execute due to the false condition.");
        }
    }
}