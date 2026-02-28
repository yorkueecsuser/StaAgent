class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length();
        System.out.println("Length of the input: " + length);
        // Mutation: Unreachable if statement
        if (isUnreachableCondition()) {
            System.out.println("This code will never be executed");
        }
    }

    // Non-final method to return a false condition
    private boolean isUnreachableCondition() {
        return false;
    }
}