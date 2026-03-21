class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            if (true && true && false && false && true && false && true && true && true && false && false) {short bupilqae = 2319;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}