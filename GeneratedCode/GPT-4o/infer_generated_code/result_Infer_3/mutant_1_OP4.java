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

        // Inserting unreachable if-else statement
        boolean isConditionMet = determineCondition(); // Using a method to avoid compile-time constant
        if (isConditionMet) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is also unreachable.");
        }
    }

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }

    // Method to simulate a condition check, always returning false
    private boolean determineCondition() {
        return false;
    }
}