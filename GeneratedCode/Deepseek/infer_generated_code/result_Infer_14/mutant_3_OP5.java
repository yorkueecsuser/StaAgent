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
    }

    public void mutantUnreachableSwitchStatement() {
        boolean condition = false;
        switch (condition? 1 : 0) {
            case 1:
                break;
            default:
                break;
        }
    }
}