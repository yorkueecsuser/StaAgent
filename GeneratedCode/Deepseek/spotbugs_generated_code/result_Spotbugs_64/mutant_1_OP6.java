class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Mutant: unreachable for loop
            System.out.println("This is an unreachable loop.");
        }
        processString(null); // Original bug: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}