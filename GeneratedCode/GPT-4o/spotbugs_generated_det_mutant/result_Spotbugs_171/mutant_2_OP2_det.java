import java.io.FilePermission;
import java.security.AccessController;
import java.security.PrivilegedAction;

class PrivilegedAccessExample {
public String readFilePath(String filePath){
    FilePermission filePermission = new FilePermission(filePath , "read");
    filePermission = new FilePermission(filePath , "read");
    AccessController.checkPermission(filePermission);
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