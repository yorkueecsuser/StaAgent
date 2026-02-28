import java.io.FilePermission;
import java.security.AccessController;
import java.security.PrivilegedAction;

class PrivilegedAccessExample {

    public String readFilePath(String filePath) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as the condition is false at runtime
        }

        FilePermission filePermission = new FilePermission(filePath, "read");
        AccessController.checkPermission(filePermission); // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        return "Permission granted for reading the file.";
    }

    private boolean getCondition() {
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