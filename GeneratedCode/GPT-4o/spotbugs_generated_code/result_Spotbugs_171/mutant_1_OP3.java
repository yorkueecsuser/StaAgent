import java.io.FilePermission;
import java.security.AccessController;

class PrivilegedAccessExample {

    private boolean getUnreachableCondition() {
        return false;
    }

    public String readFilePath(String filePath) {
        if (getUnreachableCondition()) {
            System.out.println("This block is unreachable.");
        }
        FilePermission filePermission = new FilePermission(filePath, "read");
        AccessController.checkPermission(filePermission); // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        return "Permission granted for reading the file.";
    }

    public String showBug(String filePath) {
        return readFilePath(filePath);
    }

    public static void main(String[] args) {
        PrivilegedAccessExample example = new PrivilegedAccessExample();
        System.out.println(example.showBug("test.txt"));
    }
}