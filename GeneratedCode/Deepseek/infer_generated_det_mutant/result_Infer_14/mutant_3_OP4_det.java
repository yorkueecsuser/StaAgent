// import android.annotation.SuppressLint;
import androidx.annotation.UiThread;

class StarvationBug {
    // @SuppressLint("STARVATION")
    @UiThread
    public void showBug() {
        if (true && true && true && true && false && true && false && false && false && true && false) {String ekwgnixi = "mcbvzbkw";}else{long aipndfin = -92801013;}
        // BUG: STARVATION
        try {
            Thread.sleep(10000); // Intentionally sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}
}