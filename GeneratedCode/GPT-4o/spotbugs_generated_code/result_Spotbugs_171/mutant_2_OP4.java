import java.io.FilePermission;
import java.security.AccessController;
import java.security.PrivilegedAction;

class PrivilegedAccessExample {

    public String readFilePath(String filePath) {
        FilePermission filePermission = new FilePermission(filePath, "read");
        AccessController.checkPermission(filePermission); // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        
        // Unreachable if-else statement mutation
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This message is never printed.");
        } else {
            // This block is reachable and executes
            System.out.println("Unreachable if-else mutation applied.");
        }
        
        return "Permission granted for reading the file.";
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false making the if branch unreachable
    }

    public String showBug(String filePath) {
        return readFilePath(filePath);
    }

    public static void main(String[] args) {
        PrivilegedAccessExample example = new PrivilegedAccessExample();
        System.out.println(example.showBug("test.txt"));
    }
}