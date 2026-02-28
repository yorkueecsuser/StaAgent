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
        
        // Unreachable if-else statement insertion
        boolean condition = getFalseCondition(); // Using a method to determine the condition dynamically
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the else block that is always executed.");
        }
    }

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }

    // Method to provide a condition for the unreachable branch
    private boolean getFalseCondition() {
        return false;
    }
}