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
        // Original code:
        // for (int i = 0; i < 10; i++) {
        //     textView.setText("This is a starvation bug example");
        // }

        // Mutated code:
        int i = 0;
        do {
            textView.setText("This is a starvation bug example");
            i++;
        } while (i < 10);
    }
}