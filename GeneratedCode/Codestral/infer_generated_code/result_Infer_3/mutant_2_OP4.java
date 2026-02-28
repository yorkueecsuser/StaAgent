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
        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable
        } else {
            System.out.println("This is an unreachable branch");
        }
        // Bug occurs here as @UiThread calls @NonUiThread
        // BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }

    public void showBug() {
        uiThreadMethod();
    }

    // Helper method to return a boolean condition for the if-else branch
    private boolean getCondition() {
        return false; // Always returns false to make the branch unreachable
    }
}