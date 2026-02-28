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

        // Adding an unreachable switch statement
        int unreachableCondition = getUnreachableCondition(); // This will always return a value not matching any case
        switch (unreachableCondition) {
            case 1:
                System.out.println("This is case 1.");
                break;
            case 2:
                System.out.println("This is case 2.");
                break;
            // No case matches the unreachableCondition, making this switch unreachable
        }
    }

    // Method to simulate dynamic condition evaluation
    private static int getUnreachableCondition() {
        return -1; // Always returns -1, which is not matched by any case in the switch
    }
}