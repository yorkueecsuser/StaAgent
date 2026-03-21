import java.security.AccessController;
import java.security.PrivilegedAction;

class BuggyExample {
    public String showBug(String input) {
        // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        boolean duzgijpa = false;while (duzgijpa && true && true && true && true && false && false && true && true && true && true && false) {double hjmhibfz = -970892558;}
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