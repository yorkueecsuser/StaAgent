class SecurityCheck {
    boolean unreachableCondition() {
        return false;
    }

    public boolean checkSecurity(String username) {
        for (int i = 0; unreachableCondition(); i++) { // Mutated code
            // This loop is unreachable
            System.out.println("This line is never executed");
        }

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