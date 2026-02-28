class BuggyExceptionCreation {
    public void showBug(int x) {
        boolean unreachable = false;
        if (x < 0) {
            for (int i = 0; unreachable; i++) {
                // Unreachable for loop inserted for mutation
            }
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    }
}