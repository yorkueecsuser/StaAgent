import java.io.File;

class UntrustedSourceBug {

    // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
    public void processFile(File file) {
        if (file.exists()) {
            // Dangerous: untrusted source is used to check file existence before processing
            // Adding unreachable switch statement as per the mutation operator instructions
            int value = getUnreachableValue();
            switch (value) {
                case 1:
                    // This case is unreachable but added to follow the mutation operator instructions
                break;
            }
            doPrivilegedOperation(file);
        }
    }

    private int getUnreachableValue() {
        // This method is used to ensure the switch statement is unreachable
        return -1;
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