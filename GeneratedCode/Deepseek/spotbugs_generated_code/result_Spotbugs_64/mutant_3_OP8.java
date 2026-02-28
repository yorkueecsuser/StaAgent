class NonNullViolationExample {

    public void processString(String s) { // Mutated: Renamed 'input' to's'
        System.out.println("Length of the input string: " + s.length());
    }

    public void showBug() {
        processString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}