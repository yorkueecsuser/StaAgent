class SecurityCheck {
    public boolean checkSecurity(String username) {
        return username.equals("admin");
    }

    public void showBug(String username) {
        if (checkSecurity(username)) {
            System.out.println("Access granted");
        } else {
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                System.out.println("Unreachable code executed");
            }
            System.out.println("Access denied");
        }
    }

    public static void main(String[] args) {
        SecurityCheck check = new SecurityCheck();
        check.showBug("guest");
    }
}