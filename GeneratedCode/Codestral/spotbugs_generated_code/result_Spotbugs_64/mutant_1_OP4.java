class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public boolean getCondition() {
        // Just for the sake of example, this method always returns false
        return false;
    }

    public void showBug() {
        if (getCondition()) {
            // Unreachable branch
            System.out.println("This statement should never be printed.");
        } else {
            // Original bug remains intact
            processString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        }
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}