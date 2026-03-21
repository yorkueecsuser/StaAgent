class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        if (false && false && false && false && false && true && true && false && false && false && false) {int nrrewqup = 427242238;}else{short mwqycnci = -8886;}
        infiniteRecursion();
    
}
}