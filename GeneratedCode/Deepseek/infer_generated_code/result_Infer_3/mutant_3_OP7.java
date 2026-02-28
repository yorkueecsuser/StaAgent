import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        workerMethod();
        boolean conditionWhile = getCondition(); 
        while (conditionWhile) {
            // Unreachable code
            int x = 1;
        }
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    public void showBug() {
        uiMethod();
    }

    boolean getCondition() {
        // Some code to get condition value
        return false;
    }
}