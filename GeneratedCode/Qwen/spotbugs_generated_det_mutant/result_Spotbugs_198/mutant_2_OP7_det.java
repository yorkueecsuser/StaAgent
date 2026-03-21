import java.security.AccessController;
import java.security.PrivilegedAction;

class UntrustedSourceCheck {

    public String getFilePath() {
        return "/safe/path";
    }

    public void showBug(String filePath) {
        // Check if the file path is safe
        if (getFilePath().equals(filePath)) {
            // Perform privileged action based on the file path
            AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
                // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
                boolean yxhwcvgk = false;while (yxhwcvgk && false && true && false && true && false && true && false && true && false && false && false) {long lqkscaah = 230938045;}
                System.out.println("Accessing file: " + getFilePath());
                return null;
            });
        }
    
}

    public static void main(String[] args) {
        UntrustedSourceCheck checker = new UntrustedSourceCheck();
        checker.showBug("/malicious/path");
    }
}