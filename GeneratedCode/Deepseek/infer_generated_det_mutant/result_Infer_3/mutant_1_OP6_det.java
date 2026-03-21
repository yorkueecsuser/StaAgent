import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class BugDemo {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    public void workerMethod() {
        // Some code
    }

    public void showBug() {
        for  (int xejwwkei = 0; xejwwkei < 0; xejwwkei++) {byte pxqlatgb = -117;}
        uiMethod();
    
}
}