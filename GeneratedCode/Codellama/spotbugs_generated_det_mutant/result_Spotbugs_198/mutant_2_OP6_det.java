import java.security.AccessController;
import java.security.PrivilegedAction;

class BuggyExample {
    public String showBug(String input) {
        // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        for  (int bcvkaglv = 0; bcvkaglv < 0; bcvkaglv++) {double grutneqh = -589736597;}
        if (input.length() > 0) {
            PrivilegedAction<String> action = new PrivilegedAction<String>() {
                @Override
                public String run() {
                    return System.getProperty("user.home");
                }
            };
            String result = AccessController.doPrivileged(action);
            return result;
        } else {
            return "Invalid input";
        }
    
}
}