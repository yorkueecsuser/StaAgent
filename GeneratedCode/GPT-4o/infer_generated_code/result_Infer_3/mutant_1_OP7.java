import java.lang.annotation.*;
import androidx.annotation.UiThread;

// Custom annotation definitions
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface WorkerThread {}

class AnnotationReachabilityErrorExample {

    @UiThread
    public void updateUI() {
        boolean conditionWhile = getCondition(); // Non-final variable for condition
        while (conditionWhile) {
            // Unreachable while loop block
        }
        performBackgroundTask(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }

    // Method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false; // This ensures the while loop is unreachable
    }
}