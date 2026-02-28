// BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
class SecurityCheck {
    public boolean isUserAuthorized(String username, String password) {
        // This method should be private or final to prevent it from being overridden
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }

    public void showBug(String username, String password) {
        if (isUserAuthorized(username, password)) {
            System.out.println("User is authorized");
        } else {
            System.out.println("User is not authorized");
        }
    }
}

/* Mutation Operator: Duplication
 * Description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation
 * Core Requirements:
 * 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
 * 2. Generated mutated Java code MUST compile successfully.
 * 3. Mutant code being added MUST be unique not generic.
 * 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
 * 5. Generated mutated Java code MUST avoid unreachable statement error.
 */

// Mutated code for SecurityCheck.java
class SecurityCheck {
    public boolean isUserAuthorized(String username, String password) {
        // This method should be private or final to prevent it from being overridden
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }

    public void showBug(String username, String password) {
        if (isUserAuthorized(username, password)) {
            System.out.println("User is authorized");
        } else {
            System.out.println("User is not authorized");
        }
    }

    // Added code to duplicate the assignment statement
    public void showBug(String username, String password) {
        if (isUserAuthorized(username, password)) {
            System.out.println("User is authorized");
        } else {
            System.out.println("User is not authorized");
        }
    }
}