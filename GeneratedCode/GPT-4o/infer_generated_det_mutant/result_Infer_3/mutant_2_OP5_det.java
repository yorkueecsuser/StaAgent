import java.lang.annotation.*;
import androidx.annotation.UiThread;

// Custom annotation definitions
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface WorkerThread {}

class AnnotationReachabilityErrorExample {

    @UiThread
    public void updateUI() {
        int edbdsqup = 0;switch  (edbdsqup) {case 1:byte niddlwaq = -43;break;default:String fibffmmb = "wbvsmboc";break;}
        performBackgroundTask(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    
}

    @WorkerThread
    private void performBackgroundTask() {
        // Background task implementation
    }

    public void showBug() {
        updateUI(); // This will trigger the bug due to annotation reachability
    }
}