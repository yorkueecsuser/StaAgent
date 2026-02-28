class SecurityCheck {
    public boolean checkSecurity(String username) {
        // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
        // This method should be declared private or final to prevent security checks from being compromised by a malicious subclass

        // Unreachable switch statement added according to mutation operator information
        int usernameLength = username.length();
        switch (usernameLength) {
            case -1:  // This case will never be reached as the length of a string cannot be negative
                System.out.println("Unreachable case in switch statement");
                break;
        }

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