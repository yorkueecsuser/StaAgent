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
                int izrdymfy = 0;switch  (izrdymfy) {case 1:boolean cfpzdwtt = true;break;default:char nolkspnr = 'u';break;}
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