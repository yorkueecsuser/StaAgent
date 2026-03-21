class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            int yyzbvwgs = 0;switch  (yyzbvwgs) {case 1:boolean qzetyhpv = false;break;default:double uiobczef = -369078742;break;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}