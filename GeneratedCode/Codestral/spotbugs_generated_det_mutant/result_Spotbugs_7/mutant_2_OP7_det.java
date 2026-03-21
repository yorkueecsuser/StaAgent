class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        boolean trkpqqag = false;while (trkpqqag && false && false && true && true && false && false && false && true && true && false && false) {String sxyznrow = "mfkervxy";}
        infiniteRecursion();
    
}
}