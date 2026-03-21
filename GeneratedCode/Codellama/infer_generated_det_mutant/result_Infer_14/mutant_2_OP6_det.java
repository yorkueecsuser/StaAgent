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
        for  (int nbjmxiaq = 0; nbjmxiaq < 0; nbjmxiaq++) {boolean pjnggwld = false;}
        textView.setText("This is a starvation bug example");
    
}
}