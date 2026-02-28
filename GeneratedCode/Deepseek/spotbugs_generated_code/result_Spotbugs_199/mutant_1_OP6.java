class SecurityCheck {
    public boolean checkSecurity(String username) {
        // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
        // This method should be declared private or final to prevent security checks from being compromised by a malicious subclass
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This loop should never execute");
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