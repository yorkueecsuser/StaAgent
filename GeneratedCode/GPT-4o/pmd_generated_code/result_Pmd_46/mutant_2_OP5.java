class FinalizeVisibilityExample {

    // Incorrectly overriding finalize() method as public
    public void finalize() { // BUG: FinalizeShouldBeProtected
        System.out.println("Finalize method called.");
    }

    public String showBug() {
        // Attempt to demonstrate the bug by manually calling finalize (which should not be public)
        finalize();
        return "Finalize method was called manually.";
    }

    public static void main(String[] args) {
        FinalizeVisibilityExample example = new FinalizeVisibilityExample();
        System.out.println(example.showBug());

        // Added unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable case 1.");
                break;
            case 2:
                System.out.println("This is unreachable case 2.");
                break;
            default:
                System.out.println("This is the default case.");
                break;
        }
    }

    // Helper method to simulate condition for unreachable switch case
    private static int getUnreachableValue() {
        return 3; // Always evaluates to 3, making case 1 and case 2 unreachable
    }
}