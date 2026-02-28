import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will run if shouldRun is true
            System.out.println("This is reachable.");
        } else {
            // This block is unreachable because shouldRun is always false
            System.out.println("This is unreachable.");
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
        // Always return false to make the else block unreachable
        return false;
    }
}