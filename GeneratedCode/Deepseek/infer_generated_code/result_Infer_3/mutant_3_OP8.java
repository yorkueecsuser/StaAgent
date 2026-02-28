import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        renamedWorkerMethod(); // Renamed to avoid unreachable statement error
    }

    @WorkerThread
    public void renamedWorkerMethod() {
        // Some code
    }

    public void showBug() {
        uiMethod();
    }
}