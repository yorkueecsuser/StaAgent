class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0) {
            int a = x; // Added a new variable 'a' and assigned it the value of 'x'
            new IllegalArgumentException("a must be nonnegative"); // Renamed 'x' to 'a' in the exception message
        }
    }
}