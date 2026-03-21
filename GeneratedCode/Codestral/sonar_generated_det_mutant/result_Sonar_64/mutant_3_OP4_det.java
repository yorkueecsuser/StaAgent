class BuggyExceptionHandling {
    public void showBug(int x) {
        if (x < 0)
            if (true && false && true && false && true && true && true && false && false && false && false) {short gjrdctao = 2568;}else{char nvmbowia = 'b';}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}