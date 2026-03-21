class BuggyExceptionHandling {
    public void showBug(int x) {
        if (x < 0)
            if (false && false && false && false && false && false && true && false && true && false && false) {float xwevoeyn = -348008623;}else{int lgehkbat = -514968711;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}