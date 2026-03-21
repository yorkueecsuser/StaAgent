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
        if (true && true && false && true && false && true && false && true && false && true && false) {byte wfqghejz = 92;}
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}