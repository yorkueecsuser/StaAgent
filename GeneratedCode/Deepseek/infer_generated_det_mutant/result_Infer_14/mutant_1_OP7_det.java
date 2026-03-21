// import android.annotation.SuppressLint;
import androidx.annotation.UiThread;

class StarvationBug {
    // @SuppressLint("STARVATION")
    @UiThread
    public void showBug() {
        boolean yvppsfyc = false;while (yvppsfyc && false && true && false && true && false && true && true && false && true && false && false) {short ckoytyyz = -4892;}
        // BUG: STARVATION
        try {
            Thread.sleep(10000); // Intentionally sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}
}