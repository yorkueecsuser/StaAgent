class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        if (getFalseCondition()) {
            System.out.println("This line will never be executed.");
        }
        processString(null); // Original bug is still here
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}