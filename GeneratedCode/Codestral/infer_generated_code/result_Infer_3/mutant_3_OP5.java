import androidx.annotation.UiThread;

class AnnotationReachabilityError {

    // This method is annotated with @UiThread
    @UiThread
    public void uiThreadMethod() {
        // This method transitively calls workerThreadMethod which is annotated @NonUiThread
        workerThreadMethod();
    }

    // This method is annotated with a custom @NonUiThread annotation
    // as Androidx is not available in standard Java
    @NonUiThread
    public void workerThreadMethod() {
        int value = getFalseValue();
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("This line should not execute.");
                break;
            default:
                // This is the only reachable part of the switch statement
                break;
        }
        // Bug occurs here as @UiThread calls @NonUiThread
        // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    private int getFalseValue() {
        return 0; // Always return 0 to make the switch condition false
    }

    public void showBug() {
        uiThreadMethod();
    }
}

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@interface NonUiThread {}