class SecurityCheck {
    public boolean checkSecurity(String username) {
        // Inserted mutant: Unreachable if statement
        if (getUnreachableCondition()) {
            return false;
        }

        return username.equals("admin");
    }

    // Method to generate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
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