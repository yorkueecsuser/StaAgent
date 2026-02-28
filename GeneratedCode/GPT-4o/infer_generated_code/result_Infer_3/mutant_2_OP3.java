import java.lang.annotation.*;
import androidx.annotation.UiThread;

// Custom annotation definitions
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface WorkerThread {}

class AnnotationReachabilityErrorExample {

    @UiThread
    public void updateUI() {
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is unreachable due to the condition being false
            performBackgroundTask(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        }
        performBackgroundTask(); // Original code
    }

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }

    private boolean getFalseCondition() {
        return false;
    }
}