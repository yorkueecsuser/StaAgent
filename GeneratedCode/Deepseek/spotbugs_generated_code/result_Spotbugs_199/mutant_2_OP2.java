class SecurityCheck {
    public boolean checkSecurity(String username) {
        boolean result = username.equals("admin");
        // Mutation: Duplication of the assignment statement
        boolean duplicateResult = result;
        return result;
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