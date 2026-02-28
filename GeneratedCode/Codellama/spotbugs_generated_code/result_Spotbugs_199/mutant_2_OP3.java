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

// Mutation Operator: Unreachable if statement
// Description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
class SecurityCheckWithMutant {
    private boolean condition = getCondition();
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

    // Mutant: Unreachable if statement
    private boolean getCondition() {
        return false;
    }
}