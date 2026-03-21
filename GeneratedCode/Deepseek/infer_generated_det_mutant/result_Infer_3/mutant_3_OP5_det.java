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
        int tfwpmdic = 0;switch  (tfwpmdic) {case 1:short ycjogneo = -4267;break;default:double neszjuti = 425850712;break;}
        uiMethod();
    
}
}