class BuggyExceptionHandling {
    public void showBug(int x) {
        if (x < 0)
            if (true && false && true && true && false && true && true && false && false && false && false) {double pyqsshrt = -507753604;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}