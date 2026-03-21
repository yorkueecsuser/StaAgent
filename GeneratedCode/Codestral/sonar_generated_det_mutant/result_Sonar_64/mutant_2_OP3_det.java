class BuggyExceptionHandling {
    public void showBug(int x) {
        if (x < 0)
            if (true && false && false && true && false && true && false && true && true && false && false) {long eqpmxxri = 934133179;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}