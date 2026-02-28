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
        int taskId = 0; // Example assignment statement without method invocation
        taskId = 0; // Duplicated assignment as per the Duplication Mutation Operator
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }
}