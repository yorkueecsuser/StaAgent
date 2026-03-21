class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            if (true && false && true && true && true && true && false && true && true && true && false) {double kroxvmxi = 583832648;}else{boolean xgerjnsi = false;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}