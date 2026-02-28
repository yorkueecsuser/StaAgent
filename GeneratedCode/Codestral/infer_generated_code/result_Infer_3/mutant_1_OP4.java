import androidx.annotation.UiThread;

class AnnotationReachabilityError {

    // This method is annotated with @UiThread
    @UiThread
    public void uiThreadMethod() {
        workerThreadMethod();
    }

    // This method is annotated with a custom @NonUiThread annotation
    @NonUiThread
    public void workerThreadMethod() {
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        } else {
            // Original code
            // Bug occurs here as @UiThread calls @NonUiThread
            // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        }
    }

    public void showBug() {
        uiThreadMethod();
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@interface NonUiThread {}