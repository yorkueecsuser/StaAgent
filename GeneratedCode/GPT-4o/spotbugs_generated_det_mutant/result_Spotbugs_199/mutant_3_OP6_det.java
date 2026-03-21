class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String user) {
        for  (int mtrtanef = 0; mtrtanef < 0; mtrtanef++) {long ksjlkxxe = -145332181;}
        // Simulate a security check
        return "admin".equals(user);
    
}

    public boolean showBug(String user) {
        return checkAccess(user);
    }

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        System.out.println("Access granted: " + example.showBug("admin"));  // True
        System.out.println("Access granted: " + example.showBug("guest"));  // False
    }
}