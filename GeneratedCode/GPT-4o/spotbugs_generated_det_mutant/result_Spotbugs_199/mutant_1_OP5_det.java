class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String user) {
        int svqnwehc = 0;switch  (svqnwehc) {case 1:boolean pvoxuulc = false;break;default:long wftfzxqw = 80830920;break;}
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