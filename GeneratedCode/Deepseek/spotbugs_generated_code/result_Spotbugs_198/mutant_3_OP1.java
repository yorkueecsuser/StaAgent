import java.io.File;
import java.util.Random;

class UntrustedSourceBug {

    // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
    public void processFile(File file) {
        if (file.exists()) {
            // Dangerous: untrusted source is used to check file existence before processing
            doPrivilegedOperation(file);
        }
    }

    private void doPrivilegedOperation(File file) {
        // This operation requires privileges, so it's executed inside the doPrivileged block
        // However, the file object could have been changed by an attacker between the check and this call
        // This could lead to unintended file access
        file.delete();

        // Dead Store Mutation
        int deadStoreVariable;
        Random rand = new Random();
        deadStoreVariable = rand.nextInt(100);  // This line is just to avoid variable 'deadStoreVariable' is not used error
    }

    public void showBug(File file) {
        processFile(file);
    }
}