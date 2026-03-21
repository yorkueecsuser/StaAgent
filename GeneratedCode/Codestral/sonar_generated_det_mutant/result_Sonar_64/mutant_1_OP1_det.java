class BuggyExceptionHandling {
    public void showBug(int x) {
        boolean eueycxte = false;
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}