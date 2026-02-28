class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
            // Mutation: Duplicating the exception creation
            new IllegalArgumentException("x must be nonnegative");
        }
    }
}