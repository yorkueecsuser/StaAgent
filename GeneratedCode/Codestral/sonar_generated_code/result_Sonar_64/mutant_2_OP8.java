class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0) {
            IllegalArgumentException e = new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
            // Mutant code: Renamed the exception variable from 'e' to 'a'
            IllegalArgumentException a = e;
        }
    }
}