class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            if (false && false && false && true && false && true && false && true && true && false && false) {float rlbaphqj = 815777890;}else{long nibgmlpm = -749011726;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}