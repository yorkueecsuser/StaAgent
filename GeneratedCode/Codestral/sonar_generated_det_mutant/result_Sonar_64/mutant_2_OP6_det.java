class BuggyExceptionHandling {
    public void showBug(int x) {
        if (x < 0)
            for  (int smrtpfxx = 0; smrtpfxx < 0; smrtpfxx++) {boolean foggcskg = false;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
    
}
}