import java.security.AccessController;
import java.security.PrivilegedAction;
import java.io.File;

class PrivilegedMethodBug {
    // This method requires security permission and should be invoked inside a doPrivileged block
    private static void deleteFile(String fileToDelete) {
        File file = new File(fileToDelete);
        if (file.exists()) {
            file.delete();
        }
    }

    public static void showBug(String fileToDelete) {
        // Mutant: Renamed variable to demonstrate mutation
        String fileName = fileToDelete;

        // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        deleteFile(fileName);
    }

    public static void main(String[] args) {
        // Mutant: Renamed variable to demonstrate mutation
        String fileToDelete = "sensitive_file.txt";
        showBug(fileToDelete);
    }
}