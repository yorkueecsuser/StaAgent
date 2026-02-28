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
        
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable since conditionWhile is false
            System.out.println("This is an unreachable while loop.");
        }
    }

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }

    // Method that returns a non-final condition
    private boolean getCondition() {
        return false;
    }
}