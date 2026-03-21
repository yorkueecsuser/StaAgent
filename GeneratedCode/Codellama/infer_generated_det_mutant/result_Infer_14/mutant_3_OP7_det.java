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
        boolean ehntmpip = false;while (ehntmpip && true && true && true && true && true && false && false && false && false && false && false) {double qlbexloi = 880048065;}
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}