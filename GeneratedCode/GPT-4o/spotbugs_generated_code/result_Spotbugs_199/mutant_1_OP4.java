class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String user) {
        // Simulate a security check
        return "admin".equals(user);
    }

    public boolean showBug(String user) {
        boolean unreachableCondition = false; // This condition is always false, making the if-else branch unreachable.
        
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            // The main logic of showBug method
            return checkAccess(user);
        }
        // This return statement will never be reached due to the logic above.
        return false;
    }

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        System.out.println("Access granted: " + example.showBug("admin"));  // True
        System.out.println("Access granted: " + example.showBug("guest"));  // False
    }
}