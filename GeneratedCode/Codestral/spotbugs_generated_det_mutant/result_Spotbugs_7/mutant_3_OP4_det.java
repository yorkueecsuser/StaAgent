class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        if (true && true && false && false && true && true && false && true && false && true && false) {short unklulzc = -4203;}else{char hmjttnyi = 'v';}
        infiniteRecursion();
    
}
}