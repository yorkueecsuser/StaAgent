import androidx.annotation.UiThread;

class AnnotationReachabilityError {

    @UiThread
    public void uiThreadMethod() {
        workerThreadMethod();
    }

    @NonUiThread
    public void workerThreadMethod() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as getCondition() always returns false
            // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        }
    }

    public void showBug() {
        uiThreadMethod();
    }

    // Method to dynamically determine the condition for the loop
    private boolean getCondition() {
        return false;
    }
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@interface NonUiThread {}