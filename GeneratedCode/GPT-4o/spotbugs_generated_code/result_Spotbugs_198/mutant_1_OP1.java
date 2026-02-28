import java.security.AccessController;
import java.security.PrivilegedAction;

class SecurityCheckExample {

    public static class UntrustedSource {
        public String getFilePath() {
            // Malicious subclass can override this method to return different values
            return "/safe/path/file.txt";
        }
    }

    public String showBug(UntrustedSource source) {
        // Preliminary check (potential untrusted source)
        String path = source.getFilePath(); // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        
        // Dead store insertion
        String mutateds = "abcdefgh";
        
        if (!path.startsWith("/safe/path/")) {
            throw new SecurityException("Access Denied!");
        }

        // Privileged block
        return AccessController.doPrivileged((PrivilegedAction<String>) () -> {
            // Dangerous if the method returns a different value here
            return source.getFilePath(); // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        });
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