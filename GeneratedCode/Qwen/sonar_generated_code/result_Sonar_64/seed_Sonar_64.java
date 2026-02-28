class ExceptionCreationWithoutThrowing {

    // Method to demonstrate the bug
    public String showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        return "No exception thrown";
    }

    public static void main(String[] args) {
        ExceptionCreationWithoutThrowing example = new ExceptionCreationWithoutThrowing();
        System.out.println(example.showBug(-1));
    }
}