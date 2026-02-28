class NullPointerDereference {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // This branch is unreachable as getCondition() always returns false
            System.out.println("This line will never be executed");
        } else {
            // This is the reachable branch
            System.out.println("This line is always executed");
        }
    }

    private boolean getCondition() {
        // This method always returns false to ensure the if-else branch is unreachable
        return false;
    }
}