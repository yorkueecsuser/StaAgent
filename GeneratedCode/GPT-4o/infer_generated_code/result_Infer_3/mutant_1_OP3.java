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

        // Inserting unreachable if branch
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
    }

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }
    
    // Helper method to simulate dynamic condition
    private boolean getFalseCondition() {
        return false;
    }
}