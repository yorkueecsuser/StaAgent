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

        // Inserting an unreachable switch statement
        int unreachableValue = getSwitchValue();
        switch (unreachableValue) {
            case 999: // This will never be true as getSwitchValue returns 0
                System.out.println("This is unreachable");
                break;
            default:
                // Do nothing
        }
    }

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }

    private int getSwitchValue() {
        return 0; // Dynamically returns 0, making the switch statement effectively unreachable
    }
}