class SecurityCheck {
    public boolean checkSecurity(String username) {
        // Original bug remains: This method should be declared private or final to prevent security checks from being compromised by a malicious subclass
        return username.equals("admin");
    }

    public void showBug(String u) {
        if (checkSecurity(u)) {
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