class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        for  (int ijkbzgii = 0; ijkbzgii < 0; ijkbzgii++) {int czabexna = 736711779;}
        infiniteRecursion();
    
}
}