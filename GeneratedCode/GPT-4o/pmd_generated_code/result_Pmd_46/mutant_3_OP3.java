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

        // Unreachable if statement mutation
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }
    }

    // Method to return a constant false condition
    private static boolean getUnreachableCondition() {
        return false;
    }
}