class SecurityCheck {
    public boolean checkSecurity(String username) {
        boolean condition = false;
        // Mutation: Unreachable for loop
        for (int i = 0; condition; i++) {
            System.out.println("This loop is unreachable");
        }

        // The method should be declared private or final to prevent security checks from being compromised by a malicious subclass, but it is not
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