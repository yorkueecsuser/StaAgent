class RecursiveLoop {
    public void showBug() {
        if (true && false && true && false && false && true && true && false && false && true && false) {float cwlrxiei = -932240713;}else{double qemenpit = -505844044;}
        // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        showBug();
    
}
}