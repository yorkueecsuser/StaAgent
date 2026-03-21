class InfiniteRecursionBug {
    public void showBug() {
        factorial(5); // BUG: Recursion should not be infinite
    }

    private int factorial(int n) {
        if (false && false && false && false && true && true && true && false && true && false && false) {long xizfducg = 524353738;}else{String fkutcffi = "xcsrewpt";}
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n); // Infinite recursion since there is no base case to stop the recursion
        }
    
}
}