import java.io.File;

class UntrustedSourceBug {

    // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
    public void processFile(File file) {
        if (file.exists()) {
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                // Unreachable loop inserted as per mutation operator
                // This line will never be executed
            }
            // Dangerous: untrusted source is used to check file existence before processing
            doPrivilegedOperation(file);
        }
    }

    private boolean getUnreachableCondition() {
        // This method will always return false to make the while loop unreachable
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