import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case
                break;
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
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}