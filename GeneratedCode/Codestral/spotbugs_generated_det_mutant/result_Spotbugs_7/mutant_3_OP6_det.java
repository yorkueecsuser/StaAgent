class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        for  (int pqqxvsra = 0; pqqxvsra < 0; pqqxvsra++) {char uuzushjc = 'b';}
        infiniteRecursion();
    
}
}