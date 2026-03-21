class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            for  (int zpizoddr = 0; zpizoddr < 0; zpizoddr++) {double kymsdrza = -293782370;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}