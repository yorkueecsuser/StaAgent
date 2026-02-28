import java.io.File;

class UntrustedSourceBug {

    // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
    public void processFile(File file) {
        if (file.exists()) {
            // Unreachable for loop inserted here
            boolean condition = getCondition();
            for (int i = 0; condition; i++) {
                System.out.println("This loop is unreachable");
            }
            doPrivilegedOperation(file);
        }
    }

    // Method to return false for unreachable loop
    private boolean getCondition() {
        return false;
    }

    private void doPrivilegedOperation(File file) {
        file.delete();
    }

    public void showBug(File file) {
        processFile(file);
    }
}