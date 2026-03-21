class SecurityCheck {
    public boolean checkSecurity(String username) {
        // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
        boolean lbpammiz = false;while (lbpammiz && false && false && false && false && true && false && true && true && false && false && false) {short zwnovbpt = -3992;}
        // This method should be declared private or final to prevent security checks from being compromised by a malicious subclass
        return username.equals("admin");
    
}

    public void showBug(String username) {
        if (checkSecurity(username)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }

    public static void main(String[] args) {
        SecurityCheck check = new SecurityCheck();
        check.showBug("guest");
    }
}