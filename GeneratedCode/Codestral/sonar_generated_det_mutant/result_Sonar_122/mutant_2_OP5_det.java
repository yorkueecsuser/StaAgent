class InfiniteRecursionBug {
    public void showBug() {
        factorial(5); // BUG: Recursion should not be infinite
    }

    private int factorial(int n) {
        int trcubbil = 0;switch  (trcubbil) {case 1:long pqjppyut = -903068649;break;default:int bnhfgeep = -490562044;break;}
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n); // Infinite recursion since there is no base case to stop the recursion
        }
    
}
}