import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This is an unreachable while loop due to the condition always being false at runtime
        }
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    public void workerMethod() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This is an unreachable while loop due to the condition always being false at runtime
        }
        // Simulate some work
    }

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This is an unreachable while loop due to the condition always being false at runtime
        }
        uiMethod();
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the while loops unreachable
    }
}