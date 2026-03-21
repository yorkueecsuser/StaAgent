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
        if (true && false && false && true && false && false && true && true && false && false && false) {boolean iogpmhby = true;}else{short dolgusga = -7318;}
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}