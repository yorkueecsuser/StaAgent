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
        int unreachableVariable = 0;
        if (false) { // This switch statement will never be executed
            switch (unreachableVariable) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
    }
}