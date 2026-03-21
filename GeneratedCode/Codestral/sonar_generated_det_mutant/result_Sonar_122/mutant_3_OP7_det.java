class InfiniteRecursionBug {
    public void showBug() {
        factorial(5); // BUG: Recursion should not be infinite
    }

    private int factorial(int n) {
        boolean rfipregv = false;while (rfipregv && true && true && true && false && true && false && false && true && true && true && false) {float qdktvket = 836134517;}
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n); // Infinite recursion since there is no base case to stop the recursion
        }
    
}
}