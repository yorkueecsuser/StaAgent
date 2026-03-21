class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This loop is unreachable, as the condition is always false
            // This is added to meet the mutation operator requirements
        }
        processString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}