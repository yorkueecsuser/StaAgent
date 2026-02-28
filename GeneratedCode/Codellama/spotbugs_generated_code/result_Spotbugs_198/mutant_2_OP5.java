import java.security.AccessController;
import java.security.PrivilegedAction;

class BuggyExample {
    public String showBug(String input) {
        // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
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

    public String showMutant(String input) {
        // MUTANT: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                // This code is unreachable
                PrivilegedAction<String> action = new PrivilegedAction<String>() {
                    @Override
                    public String run() {
                        return System.getProperty("user.home");
                    }
                };
                String result = AccessController.doPrivileged(action);
                return result;
            case 2:
                // This code is unreachable
                return "Invalid input";
            default:
                // This code is unreachable
                return "Default";
        }
    }
}