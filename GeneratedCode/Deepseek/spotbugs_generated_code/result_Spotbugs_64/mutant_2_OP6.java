class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public boolean getCondition() {
        return false; // This method always returns false, making the for loop unreachable.
    }

    public void showBug() {
        processString(null); // Original bug: NP_NONNULL_PARAM_VIOLATION

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed!");
        }
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}