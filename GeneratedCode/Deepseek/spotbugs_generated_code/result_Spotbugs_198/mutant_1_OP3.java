import java.io.File;

class UntrustedSourceBug {

    public void processFile(File file) {
        if (file.exists()) {
            // Unreachable if statement mutation
            if (getUnreachableCondition()) {
                // This branch is unreachable, but it's added to introduce the mutation
                throw new RuntimeException("Unreachable code executed");
            }
            doPrivilegedOperation(file);
        }
    }

    private boolean getUnreachableCondition() {
        // This method is used to dynamically determine the condition of the unreachable if statement
        return false;
    }

    private void doPrivilegedOperation(File file) {
        file.delete();
    }

    public void showBug(File file) {
        processFile(file);
    }
}