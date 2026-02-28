import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        boolean condition = getCondition(); // Non-final variable to ensure dynamic determination
        if (condition) { // Unreachable if branch
            // This block is intended to be unreachable
            System.out.println("This is an unreachable block");
        }
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
    }

    public void showBug() {
        uiMethod();
    }

    private boolean getCondition() {
        return false; // Method to dynamically determine the condition at runtime
    }
}