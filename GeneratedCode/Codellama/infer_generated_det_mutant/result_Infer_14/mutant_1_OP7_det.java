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
        boolean dwkinhnw = false;while (dwkinhnw && false && false && true && true && true && false && true && true && true && true && false) {double xyqqnxgw = -124705898;}
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}