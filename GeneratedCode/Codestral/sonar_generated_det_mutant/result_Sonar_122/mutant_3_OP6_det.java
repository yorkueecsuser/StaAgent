class InfiniteRecursionBug {
    public void showBug() {
        factorial(5); // BUG: Recursion should not be infinite
    }

    private int factorial(int n) {
        for  (int bqxdfnqg = 0; bqxdfnqg < 0; bqxdfnqg++) {String lmswnegt = "mzlnspnq";}
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n); // Infinite recursion since there is no base case to stop the recursion
        }
    
}
}