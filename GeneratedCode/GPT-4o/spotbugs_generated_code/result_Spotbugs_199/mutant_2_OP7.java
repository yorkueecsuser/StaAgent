class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String user) {
        // Simulate a security check
        return "admin".equals(user);
    }

    public boolean showBug(String user) {
        // Unreachable while loop added here
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("This line is unreachable");
        }
        return checkAccess(user);
    }

    private boolean getCondition() {
        return false; // Always returns false making the while loop unreachable
    }

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        System.out.println("Access granted: " + example.showBug("admin"));  // True
        System.out.println("Access granted: " + example.showBug("guest"));  // False
    }
}