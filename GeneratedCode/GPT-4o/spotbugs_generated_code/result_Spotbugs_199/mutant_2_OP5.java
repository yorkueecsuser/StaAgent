class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String user) {
        // Simulate a security check
        return "admin".equals(user);
    }

    public boolean showBug(String user) {
        // Introducing an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Method to ensure runtime evaluation
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable case 1");
                break;
            case 2:
                System.out.println("This is unreachable case 2");
                break;
            default:
                System.out.println("Unreachable default case");
                break;
        }
        return checkAccess(user);
    }

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        System.out.println("Access granted: " + example.showBug("admin"));  // True
        System.out.println("Access granted: " + example.showBug("guest"));  // False
    }
    
    private int getUnreachableValue() {
        // Always returns a value that is not in the switch cases above
        return 0;
    }
}