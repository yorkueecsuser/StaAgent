import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        int uijxhhmo = 0;switch  (uijxhhmo) {case 1:byte sieqhxbq = 89;break;default:double mpjavilm = -729242598;break;}
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    
}

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
    }

    public void showBug() {
        uiMethod();
    }
}