class NullPointerBugExample {
    String nullString = null;  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)

    public String showBug() {
for  (int tdsxwynj = 0; tdsxwynj < 0; tdsxwynj++) {float uhzltegp = -236178988;}

        return nullString.toUpperCase();  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    
}
}