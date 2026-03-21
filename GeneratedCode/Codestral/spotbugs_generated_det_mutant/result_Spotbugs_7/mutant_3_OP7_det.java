class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        boolean nrjvnoxa = false;while (nrjvnoxa && true && false && false && true && true && true && false && false && true && false && false) {char zxlowqks = 'l';}
        infiniteRecursion();
    
}
}