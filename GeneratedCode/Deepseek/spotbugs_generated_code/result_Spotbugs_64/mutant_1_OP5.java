class NonNullViolationExample {

    public void processString(String input) {
        int value = 0; // This value is always 0, so the switch statement will be unreachable
        switch(value) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        processString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}