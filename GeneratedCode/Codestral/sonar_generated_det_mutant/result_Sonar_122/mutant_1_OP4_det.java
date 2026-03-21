class InfiniteRecursionBug {
    public void showBug() {
        factorial(5); // BUG: Recursion should not be infinite
    }

    private int factorial(int n) {
        if (false && true && true && false && true && true && true && true && true && true && false) {double cjwbqvci = 972646926;}else{int eykhqjhk = 786514304;}
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n); // Infinite recursion since there is no base case to stop the recursion
        }
    
}
}