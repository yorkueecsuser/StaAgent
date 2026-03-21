class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            if (false && false && true && true && false && false && true && false && false && false && false) {String tcadbuha = "zjbkvbfk";}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}