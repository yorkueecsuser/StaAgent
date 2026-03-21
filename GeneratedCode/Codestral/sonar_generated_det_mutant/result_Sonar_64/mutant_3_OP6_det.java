class BuggyExceptionHandling {
    public void showBug(int x) {
        if (x < 0)
            for  (int pwtpydrl = 0; pwtpydrl < 0; pwtpydrl++) {long vqusqszt = -703553936;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}