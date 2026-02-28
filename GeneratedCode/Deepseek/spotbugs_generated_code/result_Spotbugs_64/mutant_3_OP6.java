class NonNullViolationExample {

    private boolean getFalse() {
        return false;
    }

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
        for (int i = 0; getFalse(); i++) { // Mutant: Unreachable for loop
            System.out.println("This will never be printed");
        }
    }

    public void showBug() {
        processString(null); // Original bug: NP_NONNULL_PARAM_VIOLATION
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}