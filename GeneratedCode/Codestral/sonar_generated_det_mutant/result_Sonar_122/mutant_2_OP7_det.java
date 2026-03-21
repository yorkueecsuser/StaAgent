class InfiniteRecursionBug {
    public void showBug() {
        factorial(5); // BUG: Recursion should not be infinite
    }

    private int factorial(int n) {
        boolean rlejfihm = false;while (rlejfihm && false && true && false && false && true && true && false && true && false && true && false) {boolean cjnstaps = true;}
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n); // Infinite recursion since there is no base case to stop the recursion
        }
    
}
}