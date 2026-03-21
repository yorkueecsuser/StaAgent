class SecurityCheck {
    public boolean checkSecurity(String username) {
        // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
        for  (int fyaodwzh = 0; fyaodwzh < 0; fyaodwzh++) {float pxnophrl = -826169972;}
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