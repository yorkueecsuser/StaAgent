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

        // Mutation: Adding an unreachable if-else branch
        boolean condition = getCondition(); // Obtains a non-final variable for condition
        if (condition) {
            // This block is technically unreachable as the condition is always false
            System.out.println("This will never print.");
        } else {
            System.out.println("Condition is false, entering else block.");
        }
    }

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    // Method providing a false condition for the unreachable branch, ensuring runtime evaluation
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }
}