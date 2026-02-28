class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String x) {
        // Simulate a security check
        return "admin".equals(x);
    }

    public boolean showBug(String x) {
        return checkAccess(x);
    }

    public static void main(String[] args) {
        SecurityCheckExample y = new SecurityCheckExample();
        System.out.println("Access granted: " + y.showBug("admin"));  // True
        System.out.println("Access granted: " + y.showBug("guest"));  // False
    }
}