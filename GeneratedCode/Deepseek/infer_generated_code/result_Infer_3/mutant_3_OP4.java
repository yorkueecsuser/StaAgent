import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        if (getCondition()) {
            workerMethod(); 
        } else {
            // This branch is added to ensure that the entire method is unreachable.
            System.out.println("This branch is unreachable");
        }
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    public void showBug() {
        uiMethod();
    }

    private boolean getCondition() {
        // This method always returns a non-compile-time constant.
        return 1!= 1;
    }
}