class BuggyExceptionCreation {
    public void showBug(int x) {
        int i = x;
        if (i < 0)
            new IllegalArgumentException("i must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    }
}