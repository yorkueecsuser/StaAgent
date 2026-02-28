import java.io.File;

class UntrustedSourceBug {

    // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
    public void processFile(File file) {
        if (file.exists()) {
            // Inserting unreachable for loop as per the mutation operator
            boolean loopCondition = getLoopCondition();
            for (int i = 0; loopCondition; i++) {
                // This loop is unreachable, but added to comply with the mutation operator
                System.out.println("This line will never be executed");
            }

            // Dangerous: untrusted source is used to check file existence before processing
            doPrivilegedOperation(file);
        }
    }

    // Method to mimic dynamically determined loop condition
    private boolean getLoopCondition() {
        return false;
    }

    private void doPrivilegedOperation(File file) {
        // This operation requires privileges, so it's executed inside the doPrivileged block
        // However, the file object could have been changed by an attacker between the check and this call
        // This could lead to unintended file access
        file.delete();
    }

    public void showBug(File file) {
        processFile(file);
    }
}