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

    // Unreachable for loop mutant 1
    public String showBug(String input) {
        // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        if (input.length() > 0) {
            PrivilegedAction<String> action = new PrivilegedAction<String>() {
                @Override
                public String run() {
                    for (int i = 0; false; i++) {
                        return System.getProperty("user.home");
                    }
                }
            };
            String result = AccessController.doPrivileged(action);
            return result;
        } else {
            return "Invalid input";
        }
    }

    // Unreachable for loop mutant 2
    public String showBug(String input) {
        // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        if (input.length() > 0) {
            PrivilegedAction<String> action = new PrivilegedAction<String>() {
                @Override
                public String run() {
                    for (int i = 0; i < 0; i++) {
                        return System.getProperty("user.home");
                    }
                }
            };
            String result = AccessController.doPrivileged(action);
            return result;
        } else {
            return "Invalid input";
        }
    }

    // Unreachable for loop mutant 3
    public String showBug(String input) {
        // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        if (input.length() > 0) {
            PrivilegedAction<String> action = new PrivilegedAction<String>() {
                @Override
                public String run() {
                    for (int i = 0; this.isFalse() == true; i++) {
                        return System.getProperty("user.home");
                    }
                }
            };
            String result = AccessController.doPrivileged(action);
            return result;
        } else {
            return "Invalid input";
        }
    }

    // Unreachable for loop mutant 4
    public String showBug(String input) {
        // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        if (input.length() > 0) {
            PrivilegedAction<String> action = new PrivilegedAction<String>() {
                @Override
                public String run() {
                    for (int i = 0; this.isTrue() == false; i++) {
                        return System.getProperty("user.home");
                    }
                }
            };
            String result = AccessController.doPrivileged(action);
            return result;
        } else {
            return "Invalid input";
        }
    }

    // Unreachable for loop mutant 5
    public String showBug(String input) {
        // BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        if (input.length() > 0) {
            PrivilegedAction<String> action = new PrivilegedAction<String>() {
                @Override
                public String run() {
                    for (int i = 0; this.getCondition() == false; i++) {
                        return System.getProperty("user.home");
                    }
                }
            };
            String result = AccessController.doPrivileged(action);
            return result;
        } else {
            return "Invalid input";
        }
    }
}