class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        if (getCondition()) {
            // Unreachable if-else statement mutation
            System.out.println("This code will never execute");
        } else {
            processString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        }
    }

    public boolean getCondition() {
        return false; // always returns false to ensure the if condition is unreachable
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}