import java.security.AccessController;
import java.security.PrivilegedAction;
import java.io.File;

class PrivilegedMethodBug {
    // This method requires security permission and should be invoked inside a doPrivileged block
    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }

    public static void showBug(String fileName) {
        // Inserting unreachable if branch with a condition that is always false
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            AccessController.doPrivileged(new PrivilegedAction<Void>() {
                public Void run() {
                    deleteFile(fileName);
                    return null;
                }
            });
        }
        // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        deleteFile(fileName);
    }

    private static boolean getUnreachableCondition() {
        // This method is for demonstration purposes and always returns false
        return false;
    }

    public static void main(String[] args) {
        String fileName = "sensitive_file.txt";
        showBug(fileName);
    }
}