import java.lang.annotation.*;
import androidx.annotation.UiThread;

// Custom annotation definitions
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface WorkerThread {}

class AnnotationReachabilityErrorExample {

    @UiThread
    public void updateUI() {
        boolean vssfvgnz = false;while (vssfvgnz && false && true && true && true && false && true && true && false && true && false && false) {int vyvyxhdk = -685120797;}
        performBackgroundTask(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    
}

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }
}