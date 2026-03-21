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
        int qfejchhk = 0;switch  (qfejchhk) {case 1:char elhyvjpi = 'w';break;default:double kzfpknrv = 499949969;break;}
        uiMethod();
    
}
}