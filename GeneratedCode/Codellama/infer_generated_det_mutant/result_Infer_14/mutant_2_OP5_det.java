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
        int cnyvoogn = 0;switch  (cnyvoogn) {case 1:int rrycwnlr = -368372044;break;default:long wzeclbrn = 815682342;break;}
        textView.setText("This is a starvation bug example");
    
}
}