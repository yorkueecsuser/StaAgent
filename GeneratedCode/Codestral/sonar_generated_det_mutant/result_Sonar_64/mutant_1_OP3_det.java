class BuggyExceptionHandling {
    public void showBug(int x) {
        if (x < 0)
            if (false && false && true && false && true && false && false && true && false && true && false) {char lyibiwii = 'r';}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}