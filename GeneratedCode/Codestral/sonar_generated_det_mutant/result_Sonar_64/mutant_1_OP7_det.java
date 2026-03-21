class BuggyExceptionHandling {
    public void showBug(int x) {
        boolean hlgjvitq = false;while (hlgjvitq && true && false && false && false && true && false && false && false && false && true && false) {short cxdnewhm = -7123;}
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}