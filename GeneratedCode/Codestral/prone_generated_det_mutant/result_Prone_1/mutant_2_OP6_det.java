class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            for  (int czrjwwct = 0; czrjwwct < 0; czrjwwct++) {short agkfobaf = -4811;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}