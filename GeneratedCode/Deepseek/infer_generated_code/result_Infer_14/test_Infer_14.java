import org.junit.Test;
import static org.junit.Assert.*;

import android.annotation.SuppressLint;
import androidx.annotation.UiThread;

public class StarvationBugTest {

    @Test // TRIGGER BUG: STARVATION
    public void testShowBug() {
        StarvationBug bug = new StarvationBug();
        bug.showBug(); // BUG: STARVATION
    }

    class StarvationBug {
        @SuppressLint("STARVATION")
        @UiThread
        public void showBug() {
            try {
                Thread.sleep(10000); // BUG: STARVATION
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}