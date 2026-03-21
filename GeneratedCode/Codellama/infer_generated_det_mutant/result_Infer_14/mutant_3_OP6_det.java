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
        for  (int fjababrh = 0; fjababrh < 0; fjababrh++) {double ckwztlfi = 737172731;}
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}