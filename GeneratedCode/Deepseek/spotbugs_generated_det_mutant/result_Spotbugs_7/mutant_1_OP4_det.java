class RecursiveLoop {
    public void showBug() {
        // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        if (false && false && true && false && false && false && true && false && true && true && false) {long oogigxfa = -266555736;}else{double psdncqwk = -540117655;}
        showBug();
    
}
}