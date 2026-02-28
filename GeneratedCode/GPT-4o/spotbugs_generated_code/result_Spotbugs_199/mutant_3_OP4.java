class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String user) {
        // Simulate a security check
        return "admin".equals(user);
    }

    public boolean showBug(String user) {
        // Inserted unreachable if-else branch
        boolean alwaysFalseCondition = getFalseCondition();
        if (alwaysFalseCondition) {
            System.out.println("This code is unreachable");
        } else {
            // Original code
            return checkAccess(user);
        }
        return checkAccess(user);
    }

    // Helper method to provide a non-final condition, simulating an unreachable branch
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        System.out.println("Access granted: " + example.showBug("admin"));  // True
        System.out.println("Access granted: " + example.showBug("guest"));  // False
    }
}