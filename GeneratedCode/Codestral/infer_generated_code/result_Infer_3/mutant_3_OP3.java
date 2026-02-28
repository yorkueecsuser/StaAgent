import androidx.annotation.UiThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiThreadMethod() {
        if (shouldNotRun()) { // Unreachable if statement
            // This code will never be executed
        }
        workerThreadMethod();
    }

    @NonUiThread
    public void workerThreadMethod() {
        // Bug occurs here as @UiThread calls @NonUiThread
        // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    public void showBug() {
        uiThreadMethod();
    }

    private boolean shouldNotRun() {
        // This method always returns false, making the if statement unreachable
        return false;
    }
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@interface NonUiThread {}