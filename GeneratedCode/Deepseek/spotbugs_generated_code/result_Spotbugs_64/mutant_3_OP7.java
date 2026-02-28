class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        processString(null); // Original bug: NP: Method call passes null to a non-null parameter

        // Mutant: Unreachable while loop
        boolean conditionWhile = false; // Non-final variable used as the loop condition
        while (conditionWhile) {
            System.out.println("This line will never be executed");
        }
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}