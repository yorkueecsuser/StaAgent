import java.io.FilePermission;
import java.security.AccessController;
import java.security.PrivilegedAction;

class PrivilegedAccessExample {

    public String readFilePath(String filePath) {
        FilePermission filePermission = new FilePermission(filePath, "read");
        AccessController.checkPermission(filePermission); // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        
        // Unreachable if-else branch
        boolean shouldExecute = getRuntimeCondition();
        if (shouldExecute) {
            System.out.println("This code branch is unreachable.");
        } else {
            System.out.println("This is the reachable code branch.");
        }
        
        return "Permission granted for reading the file.";
    }

    private boolean getRuntimeCondition() {
        return false;
    }

    public String showBug(String filePath) {
        return readFilePath(filePath);
    }

    public static void main(String[] args) {
        PrivilegedAccessExample example = new PrivilegedAccessExample();
        System.out.println(example.showBug("test.txt"));
    }
}