import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        workerMethod();
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    public void showBug() {
        boolean condition = getCondition();
        if (!condition) {
            switch (0) {
                case 1:
                    // unreachable code
                    break;
            }
        }
        uiMethod();
    }

    private boolean getCondition() {
        return false;
    }
}