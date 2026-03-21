import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class StarvationActivity {
    private TextView textView;

    @UiThread
    @SuppressLint("STARVATION")
    public void showBug() {
        boolean gmtgczvn = false;while (gmtgczvn && false && true && false && false && false && false && true && false && true && true && false) {double rgadbszn = 198193218;}
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}