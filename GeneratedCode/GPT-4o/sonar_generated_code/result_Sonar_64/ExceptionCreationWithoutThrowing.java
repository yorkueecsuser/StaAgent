class ExceptionCreationWithoutThrowing {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    }

    public static void main(String[] args) {
        ExceptionCreationWithoutThrowing example = new ExceptionCreationWithoutThrowing();
        example.showBug(-5); // This will demonstrate the bug
    }
}