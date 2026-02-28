class SecurityCheck {
    public boolean getAlwaysFalseCondition() {
        return false;
    }

    public boolean checkSecurity(String username) {
        if (getAlwaysFalseCondition()) {
            // Unreachable if-branch
            System.out.println("This branch should never execute.");
        } else {
            // Original code
            return username.equals("admin");
        }
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