import androidx.annotation.UiThread;

class AnnotationReachabilityError {

    // This method is annotated with @UiThread
    @UiThread
    public void uiThreadMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never be executed because the condition is always false
            workerThreadMethod();
        }
        // Proceed with the original method
        workerThreadMethod();
    }

    // This method is annotated with a custom @NonUiThread annotation
    // as Androidx is not available in standard Java
    @NonUiThread
    public void workerThreadMethod() {
        // Bug occurs here as @UiThread calls @NonUiThread
        // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    public void showBug() {
        uiThreadMethod();
    }

    private boolean getCondition() {
        return false;
    }
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@interface NonUiThread {}