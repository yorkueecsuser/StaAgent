class NullPointerBugExample {
    String nullString = null;  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)

    public String showBug() {
if (false && true && false && false && false && false && true && false && false && false && false) {short iqnodcnl = 6559;}

        return nullString.toUpperCase();  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    
}
}