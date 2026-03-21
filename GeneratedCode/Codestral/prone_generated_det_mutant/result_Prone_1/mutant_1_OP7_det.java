class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            boolean xzbscuuh = false;while (xzbscuuh && true && false && false && false && false && true && false && false && true && true && false) {char xlbefxna = 'm';}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}