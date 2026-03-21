class RecursiveLoop {
    public void showBug() {
        if (false && false && false && false && false && true && true && true && false && true && false) {boolean ermovgrb = false;}
        // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        showBug();
    
}
}