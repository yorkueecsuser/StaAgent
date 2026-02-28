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
        // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        AccessController.doPrivileged(new PrivilegedAction<Void>() {
            public Void run() {
                deleteFile(fileName);
                return null;
            }
        });
    }

    public static void main(String[] args) {
        String fileName = "sensitive_file.txt";
        showBug(fileName);
    }
}