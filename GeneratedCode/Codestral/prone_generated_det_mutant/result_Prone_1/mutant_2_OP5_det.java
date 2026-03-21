class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            int vdjpcent = 0;switch  (vdjpcent) {case 1:short ljllqgsq = 8349;break;default:boolean cdtgkgxg = false;break;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}