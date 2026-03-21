class NonNullViolationExample {

    public boolean getFalseCondition() {
        return false;
    }

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
        if (getFalseCondition()) { // Mutant: Unreachable switch statement
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This should not be printed.");
                    break;
            }
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