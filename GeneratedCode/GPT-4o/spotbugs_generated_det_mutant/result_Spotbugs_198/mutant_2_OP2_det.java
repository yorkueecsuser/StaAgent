import java.security.AccessController;
import java.security.PrivilegedAction;

class SecurityCheckExample {

    public static class UntrustedSource {
        public String getFilePath() {
            // Malicious subclass can override this method to return different values
            return "/safe/path/file.txt";
        }
    }
public String showBug(UntrustedSource source){
    String path = source.getFilePath();
    path = source.getFilePath();
    if(! path.startsWith("/safe/path/")) { throw new SecurityException("Access Denied!"); }
    return AccessController.doPrivileged(( PrivilegedAction < String > )() -> { return source.getFilePath(); });
}

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        UntrustedSource source = new UntrustedSource();

        try {
            String result = example.showBug(source);
            System.out.println("File Path: " + result);
        } catch (SecurityException e) {
            System.out.println("Security Exception: " + e.getMessage());
        }
    }
}