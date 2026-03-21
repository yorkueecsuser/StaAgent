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
        if (true && true && true && true && true && true && true && true && true && false && false) {float tdihzwvw = 306983765;}
        // BUG: STARVATION
        textView.setText("This is a starvation bug example");
    
}
}