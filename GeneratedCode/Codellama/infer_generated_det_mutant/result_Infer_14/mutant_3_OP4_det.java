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
        if (true && false && false && false && true && true && false && true && false && false && false) {long istaqans = 574418886;}else{float potheiqv = 958612737;}
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}