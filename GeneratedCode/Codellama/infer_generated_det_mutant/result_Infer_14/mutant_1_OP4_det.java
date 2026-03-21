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
        if (true && true && false && true && true && true && true && false && true && true && false) {char tnhffynz = 'e';}else{byte swylyitq = 46;}
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}