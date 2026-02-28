import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        int value = getValue();
        switch(value) {
            case 1:
                // unreachable code added
                break;
        }
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    public void showBug() {
        uiMethod();
    }

    private int getValue() {
        return 0; // this ensures that the condition of switch statement is dynamically determined at runtime.
    }
}