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

        int unreachableSwitchValue = getDynamicValue();
        switch (unreachableSwitchValue) {
            case 999: // This case is intended to be unreachable
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case to ensure switch statement is complete
                break;
        }
    }

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }

    private int getDynamicValue() {
        return -1; // Ensures the switch statement doesn't reach case 999
    }
}