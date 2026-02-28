class NonNullViolationExample {

    private boolean getFalseCondition() { // Helper method to get false condition
        return false;
    }

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
        switch (getFalseCondition()? 1 : 2) { // Unreachable switch statement
            case 1:
                System.out.println("This line should never be reached.");
                break;
        }
    }

    public void showBug() {
        processString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}