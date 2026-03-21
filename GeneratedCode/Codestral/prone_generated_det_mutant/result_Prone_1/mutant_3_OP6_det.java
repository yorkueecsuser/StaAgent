class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            for  (int rydgvhzj = 0; rydgvhzj < 0; rydgvhzj++) {String lenmdfxb = "ttscdxhi";}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}