import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
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
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}