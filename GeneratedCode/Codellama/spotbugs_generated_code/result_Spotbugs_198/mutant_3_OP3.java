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
}

// Mutation Operator: Unreachable if statement
// Description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.

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
}

class MutantBuggyExample {
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

    public String showBugMutant(String input) {
        // Mutant: Unreachable if statement
        if (false) {
            return "Invalid input";
        } else {
            PrivilegedAction<String> action = new PrivilegedAction<String>() {
                @Override
                public String run() {
                    return System.getProperty("user.home");
                }
            };
            String result = AccessController.doPrivileged(action);
            return result;
        }
    }
}