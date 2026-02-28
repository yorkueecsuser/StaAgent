class NonNullViolationExample {

    // Method to get a condition that will always be false at runtime
    private boolean getCondition() {
        return false;
    }

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        // Inserted unreachable while loop
        while (getCondition()) {
            System.out.println("This line will never be executed.");
        }

        processString(null); // Original bug: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}