class NullPointerBugExample {
    String nullString = null;  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)

    public String showBug() {
if (true && true && false && true && true && false && true && true && false && true && false) {long veiwlorq = -87134530;}else{String blsahcqy = "ajumjpua";}

        return nullString.toUpperCase();  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    
}
}