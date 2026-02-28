class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String user) {
        // Simulate a security check
        return "admin".equals(user);
    }

    public boolean showBug(String user) {
        // Introduce an unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This should never be printed.");
        } else {
            System.out.println("This else branch is executed.");
        }

        return checkAccess(user);
    }

    // Method to simulate a condition that results in an unreachable if-else statement
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        System.out.println("Access granted: " + example.showBug("admin"));  // True
        System.out.println("Access granted: " + example.showBug("guest"));  // False
    }
}