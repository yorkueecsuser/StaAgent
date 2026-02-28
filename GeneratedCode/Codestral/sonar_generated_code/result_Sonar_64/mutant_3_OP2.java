class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
            new IllegalArgumentException("x must be nonnegative"); // Mutant code added
        }
    }
}