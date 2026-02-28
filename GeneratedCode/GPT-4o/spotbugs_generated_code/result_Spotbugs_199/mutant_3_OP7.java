class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String user) {
        // Simulate a security check
        return "admin".equals(user);
    }

    public boolean showBug(String user) {
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition(); // This method should always return false
        while (conditionWhile) {
            System.out.println("This statement is unreachable.");
        }
        
        return checkAccess(user);
    }
    
    // Helper method to simulate dynamic condition
    private boolean getCondition() {
        return false; // Always returns false to make the while loop unreachable
    }

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        System.out.println("Access granted: " + example.showBug("admin"));  // True
        System.out.println("Access granted: " + example.showBug("guest"));  // False
    }
}