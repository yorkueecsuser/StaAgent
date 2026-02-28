import java.security.AccessController;
import java.security.PrivilegedAction;
import java.io.File;

class PrivilegedMethodBug {
    // This method requires security permission and should be invoked inside a doPrivileged block
    private static void deleteFile(String fileName) {
        boolean shouldDelete = getCondition(); // Introduce a dynamic condition
        if (shouldDelete) {
            File file = new File(fileName);
            if (file.exists()) {
                file.delete();
            }
        } else {
            // Unreachable else branch - the condition is always false
            throw new IllegalStateException("Unreachable code executed.");
        }
    }

    // Method to provide a dynamic condition
    private static boolean getCondition() {
        return false;
    }

    public static void showBug(String fileName) {
        // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        deleteFile(fileName);
    }

    public static void main(String[] args) {
        String fileName = "sensitive_file.txt";
        showBug(fileName);
    }
}