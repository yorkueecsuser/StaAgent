class NonNullViolationExample {

    public void processString(String input) {
        System.out.println("Length of the input string: " + input.length());
    }

    public void showBug() {
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This branch is unreachable");
        } else {
            processString(null); // Original bug remains here
        }
    }

    public static void main(String[] args) {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug();
    }
}