class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String user) {
        // Simulate a security check
        return "admin".equals(user);
    }

    public boolean showBug(String user) {
        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // Non-final variable to avoid unreachable error
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }

        return checkAccess(user);
    }

    // Method to ensure the condition is not a compile-time constant
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        System.out.println("Access granted: " + example.showBug("admin"));  // True
        System.out.println("Access granted: " + example.showBug("guest"));  // False
    }
}