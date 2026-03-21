class InfiniteRecursionBug {
    public void showBug() {
        factorial(5); // BUG: Recursion should not be infinite
    }

    private int factorial(int n) {
        boolean tizfobtm = false;while (tizfobtm && false && true && false && true && true && false && false && true && true && false && false) {char sabzlilm = 'p';}
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n); // Infinite recursion since there is no base case to stop the recursion
        }
    
}
}