import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        workerMethod(); // MUTANT: Unreachable switch statement
        int value = getValue();
        switch(value) {
            default:
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

    public int getValue() {
        return 0;
    }
}