class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            if (false && false && false && false && false && false && false && true && false && true && false) {double xhulubda = 451617827;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}