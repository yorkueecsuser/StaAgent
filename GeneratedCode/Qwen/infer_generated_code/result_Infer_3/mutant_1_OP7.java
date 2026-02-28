import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR

        // Introduced unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }
    }

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
    }

    public void showBug() {
        uiMethod();
    }

    private boolean getCondition() {
        // Always return false to ensure the loop is unreachable
        return false;
    }
}