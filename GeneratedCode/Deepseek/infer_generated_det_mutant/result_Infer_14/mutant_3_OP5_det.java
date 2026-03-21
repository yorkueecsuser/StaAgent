// import android.annotation.SuppressLint;
import androidx.annotation.UiThread;

class StarvationBug {
    // @SuppressLint("STARVATION")
    @UiThread
    public void showBug() {
        int ldvmxeha = 0;switch  (ldvmxeha) {case 1:short fviywdgl = 1930;break;default:int edbvivpk = 327721633;break;}
        // BUG: STARVATION
        try {
            Thread.sleep(10000); // Intentionally sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}
}