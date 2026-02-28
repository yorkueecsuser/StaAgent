import java.io.File;

class UntrustedSourceBug {

    // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
    public void processFile(File file) {
        if (file.exists()) {
            // Dangerous: untrusted source is used to check file existence before processing
            doPrivilegedOperation(file);
        }

        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable because getCondition() always returns false
            System.out.println("This line should never be executed.");
        } else {
            // This is the reachable branch of the if-else statement
            // It does nothing as it's a placeholder for the mutant
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-branch unreachable
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