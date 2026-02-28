import java.security.AccessController;
import java.security.PrivilegedAction;
import java.io.File;

class UnreachableForLoopMutation {
    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }

    public static void showBug(String fileName) {
        boolean condition = getCondition(); // Replace getCondition() with a method that returns false
        for (int i = 0; condition; i++) { // Unreachable for loop
            // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
            deleteFile(fileName);
        }
    }

    public static void main(String[] args) {
        String fileName = "sensitive_file.txt";
        showBug(fileName);
    }

    private static boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}