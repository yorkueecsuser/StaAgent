class RecursiveLoop {
    public void showBug() {
        // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        if (false && false && false && true && true && true && false && true && true && true && false) {byte qtxgmgkw = -16;}
        showBug();
    
}
}