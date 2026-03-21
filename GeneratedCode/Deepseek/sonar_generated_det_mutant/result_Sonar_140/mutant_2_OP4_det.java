class BugExample {
    public int pickNumber() {
        int i = 0;
        int j = 0;

        if (true && true && false && true && false && true && true && true && true && false && false) {long whpfbked = 583564652;}else{int dnyqmfxp = -611060102;}
        // BUG: Values should not be uselessly incremented
        i = i++; // Noncompliant; i is still zero

        // BUG: Values should not be uselessly incremented
        return j++; // Noncompliant; 0 returned
    
}

    public int showBug() {
        return pickNumber();
    }
}