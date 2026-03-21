class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            boolean iledeuus = false;while (iledeuus && true && false && false && false && true && false && false && false && true && false && false) {long akolsmiq = 242311864;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}