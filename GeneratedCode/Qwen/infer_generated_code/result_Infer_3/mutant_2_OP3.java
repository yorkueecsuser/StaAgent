import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        if (condition) {
            // This block is reachable if condition is true
        }
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        if (condition) {
            // This block is reachable if condition is true
        }
    }

    public void showBug() {
        uiMethod();
        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        if (condition) {
            // This block is reachable if condition is true
        }
    }

    private boolean getCondition() {
        // This method returns a dynamic condition
        return false; // In a real scenario, this could return a dynamically determined value
    }
}