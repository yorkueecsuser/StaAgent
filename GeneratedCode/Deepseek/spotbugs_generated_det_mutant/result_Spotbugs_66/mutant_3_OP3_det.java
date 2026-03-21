class NullPointerBugExample {
    String nullString = null;  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)

    public String showBug() {
if (false && true && false && false && false && false && false && false && true && true && false) {int kxtmpsoj = 164249089;}

        return nullString.toUpperCase();  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    
}
}