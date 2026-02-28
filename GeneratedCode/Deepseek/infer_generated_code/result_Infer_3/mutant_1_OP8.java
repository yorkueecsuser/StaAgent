import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        anotherWorkerMethod(); // New mutated method name
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    @WorkerThread
    public void anotherWorkerMethod() { // New mutated method
        // Same code as workerMethod()
    }

    public void showBug() {
        uiMethod();
    }
}