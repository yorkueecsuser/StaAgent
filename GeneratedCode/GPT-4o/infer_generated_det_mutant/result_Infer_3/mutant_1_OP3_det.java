import java.lang.annotation.*;
import androidx.annotation.UiThread;

// Custom annotation definitions
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface WorkerThread {}

class AnnotationReachabilityErrorExample {

    @UiThread
    public void updateUI() {
        if (false && true && true && false && false && true && false && false && false && false && false) {double wtejlclr = 283507490;}
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