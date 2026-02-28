class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        processString(null); // Original bug
        processString(null); // Duplicate the bug
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}