// import android.annotation.SuppressLint;
import androidx.annotation.UiThread;

class StarvationBug {
    // @SuppressLint("STARVATION")
    @UiThread
    public void showBug() {
        int lqhrqcaa = 0;switch  (lqhrqcaa) {case 1:char xhsokfwh = 'k';break;default:int jgrxrlip = 397048113;break;}
        // BUG: STARVATION
        try {
            Thread.sleep(10000); // Intentionally sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}
}