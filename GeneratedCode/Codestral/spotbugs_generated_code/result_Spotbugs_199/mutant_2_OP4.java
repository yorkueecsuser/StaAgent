class SecurityCheck {
    public boolean checkSecurity(String username) {
        // Original bug: VSC_VULNERABLE_SECURITY_CHECK_METHODS
        return username.equals("admin");
    }

    public void showBug(String username) {
        if (checkSecurity(username)) {
            System.out.println("Access granted");
        } else {
            // Mutation: Unreachable if-else statement
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                System.out.println("This line should never execute");
            } else {
                System.out.println("Access denied");
            }
        }
    }

    public static void main(String[] args) {
        SecurityCheck check = new SecurityCheck();
        check.showBug("guest");
    }
}