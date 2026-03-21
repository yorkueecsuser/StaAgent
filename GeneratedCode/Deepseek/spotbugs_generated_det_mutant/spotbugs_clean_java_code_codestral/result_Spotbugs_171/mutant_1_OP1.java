import java.security.AccessController;
import java.security.PrivilegedAction;
import java.io.File;

class PrivilegedMethodBug {
    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }

    public static void showBug(String fileName) {
        // adding dead store as per mutation operator
        int xyzabcde = 10;

        deleteFile(fileName);
    }

    public static void main(String[] args) {
        String fileName = "sensitive_file.txt";
        showBug(fileName);
    }
}