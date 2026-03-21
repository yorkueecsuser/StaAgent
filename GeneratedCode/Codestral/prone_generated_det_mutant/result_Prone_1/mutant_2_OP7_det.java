class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            boolean cjyxhkyg = false;while (cjyxhkyg && false && false && false && true && false && false && false && true && true && true && false) {double pefzjzyj = -213516067;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}