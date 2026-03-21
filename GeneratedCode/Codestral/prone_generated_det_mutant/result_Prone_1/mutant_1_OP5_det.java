class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            int udyvxrrf = 0;switch  (udyvxrrf) {case 1:long kzojbmcc = -146209642;break;default:char ucbopmoa = 'z';break;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}