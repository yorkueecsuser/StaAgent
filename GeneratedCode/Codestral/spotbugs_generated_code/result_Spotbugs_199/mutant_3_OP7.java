class SecurityCheck {
    public boolean checkSecurity(String username) {
        // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
        // This method should be declared private or final to prevent security checks from being compromised by a malicious subclass
        boolean isAdmin = username.equals("admin");
        // Adding an unreachable while loop based on the Mutation Operator information
        boolean conditionWhile = getCondition(); // Assuming getCondition() is a method that returns a boolean
        while (conditionWhile) {
            System.out.println("This line should never be executed");
        }
        return isAdmin;
    }

    public void showBug(String username) {
        if (checkSecurity(username)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }

    public static void main(String[] args) {
        SecurityCheck check = new SecurityCheck();
        check.showBug("guest");
    }

    // Adding a dummy method to avoid compile error
    private boolean getCondition() {
        return false; // This is always false to ensure the while loop is unreachable
    }
}