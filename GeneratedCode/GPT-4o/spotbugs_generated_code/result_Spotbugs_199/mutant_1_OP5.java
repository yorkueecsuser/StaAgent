class SecurityCheckExample {

    // This method performs a security check but is neither private nor final.
    // BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    protected boolean checkAccess(String user) {
        // Simulate a security check
        return "admin".equals(user);
    }

    public boolean showBug(String user) {
        return checkAccess(user);
    }

    public static void main(String[] args) {
        SecurityCheckExample example = new SecurityCheckExample();
        System.out.println("Access granted: " + example.showBug("admin"));  // True
        System.out.println("Access granted: " + example.showBug("guest"));  // False

        // Introducing an unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            case 2:
                System.out.println("This will also never be executed.");
                break;
            default:
                System.out.println("Default case, also never executed.");
        }
    }

    // This method returns a value that will ensure the switch case is unreachable
    private static int getUnreachableCondition() {
        // This always returns 0, making the switch cases unreachable
        return 0;
    }
}