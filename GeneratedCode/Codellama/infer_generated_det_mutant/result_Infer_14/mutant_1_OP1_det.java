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
        short pitwvrlt = 2226;
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}