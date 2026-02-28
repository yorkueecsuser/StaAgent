import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiMethod() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    @WorkerThread
    public void workerMethod() {
        // Simulate some work
    }

    public void showBug() {
        uiMethod();
    }

    // Mutant 1: Renaming 'uiMethod' to 'a'
    @UiThread
    public void a() {
        workerMethod(); // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    // Mutant 2: Renaming 'workerMethod' to 'b'
    @WorkerThread
    public void b() {
        // Simulate some work
    }

    // Mutant 3: Renaming'showBug' to 'c'
    public void c() {
        a();
    }
}