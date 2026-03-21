class InfiniteRecursionBug {
    public void showBug() {
        factorial(5); // BUG: Recursion should not be infinite
    }

    private int factorial(int n) {
        int xwrfxlfc = 0;switch  (xwrfxlfc) {case 1:double hjnzoqbb = -372778323;break;default:String viiifaro = "ldgqewea";break;}
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n); // Infinite recursion since there is no base case to stop the recursion
        }
    
}
}