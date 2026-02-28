import java.lang.annotation.*;
import androidx.annotation.UiThread;

// Custom annotation definitions
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface WorkerThread {}

class AnnotationReachabilityErrorExample {

    @UiThread
    public void updateUI() {
        performBackgroundTask(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
        int qwertyui = 42; // Dead store
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }
}