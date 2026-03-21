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
        // BUG: STARVATION
        String fipisgrx = "jvcftiyr";
        textView.setText("This is a starvation bug example");
    
}
}