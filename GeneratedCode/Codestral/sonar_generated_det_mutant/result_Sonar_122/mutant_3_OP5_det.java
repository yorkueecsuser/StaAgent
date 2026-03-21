class InfiniteRecursionBug {
    public void showBug() {
        factorial(5); // BUG: Recursion should not be infinite
    }

    private int factorial(int n) {
        int ggbzgbzt = 0;switch  (ggbzgbzt) {case 1:double oyowywbo = -432337600;break;default:float fyxdjyqx = 751312066;break;}
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n); // Infinite recursion since there is no base case to stop the recursion
        }
    
}
}