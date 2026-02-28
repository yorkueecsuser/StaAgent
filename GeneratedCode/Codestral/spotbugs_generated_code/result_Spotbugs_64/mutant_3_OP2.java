class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        processString(null);
        // Mutant code added
        processString(null);
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}