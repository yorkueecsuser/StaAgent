class BuggyExceptionHandling {
    public void showBug(int x) {
        boolean ojwurgmk = false;while (ojwurgmk && false && false && false && true && true && true && false && true && false && false && false) {char mkjboiop = 'p';}
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}