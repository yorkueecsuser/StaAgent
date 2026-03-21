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
        int cfslcprd = 0;switch  (cfslcprd) {case 1:boolean lxlrmypq = false;break;default:short llavsvyg = -1444;break;}
        textView.setText("This is a starvation bug example");
    
}
}