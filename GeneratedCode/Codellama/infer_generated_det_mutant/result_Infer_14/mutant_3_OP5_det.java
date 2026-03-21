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
        int gvbmhtpd = 0;switch  (gvbmhtpd) {case 1:long nyjgasma = -702573330;break;default:double hxiphbbe = -627812657;break;}
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}