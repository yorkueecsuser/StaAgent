import java.io.FilePermission;
import java.security.AccessController;
import java.security.PrivilegedAction;

class PrivilegedAccessExample {

    public String readFilePath(String b) {
        FilePermission filePermission = new FilePermission(b, "read");
        AccessController.checkPermission(filePermission); // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        return "Permission granted for reading the file.";
    }

    public String showBug(String filePath) {
        return readFilePath(filePath);
    }

    public static void main(String[] args) {
        PrivilegedAccessExample c = new PrivilegedAccessExample();
        System.out.println(c.showBug("test.txt"));
    }
}