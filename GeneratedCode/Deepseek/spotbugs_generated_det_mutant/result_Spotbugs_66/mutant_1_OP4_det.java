class NullPointerBugExample {
    String nullString = null;  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)

    public String showBug() {
if (false && true && true && true && false && false && false && false && true && false && false) {char bztcnmwf = 'j';}else{long pyqzxwnt = -560690522;}

        return nullString.toUpperCase();  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    
}
}