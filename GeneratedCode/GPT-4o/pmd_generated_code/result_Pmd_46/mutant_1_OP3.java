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

        // Unreachable if statement mutant
        boolean shouldExecute = getCondition();
        if (shouldExecute) {
            System.out.println("This if block is unreachable and will not be executed.");
        }
    }

    // Simulate a condition method that always returns false to insert an unreachable branch
    private static boolean getCondition() {
        return false;
    }
}