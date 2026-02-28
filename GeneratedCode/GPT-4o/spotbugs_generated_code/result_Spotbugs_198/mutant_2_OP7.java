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
        // Introduce a variable to control the unreachable while loop
        boolean conditionWhile = getFalseCondition();

        // Preliminary check (potential untrusted source)
        String path = source.getFilePath(); // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)

        if (!path.startsWith("/safe/path/")) {
            throw new SecurityException("Access Denied!");
        }

        // Unreachable while loop
        while (conditionWhile) {
            // This block will never execute
            System.out.println("This is unreachable code.");
        }

        // Privileged block
        return AccessController.doPrivileged((PrivilegedAction<String>) () -> {
            // Dangerous if the method returns a different value here
            return source.getFilePath(); // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        });
    }

    // Helper method to provide a false condition
    private boolean getFalseCondition() {
        return false;
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