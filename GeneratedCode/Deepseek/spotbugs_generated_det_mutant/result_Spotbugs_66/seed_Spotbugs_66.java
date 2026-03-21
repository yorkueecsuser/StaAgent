class NullPointerBugExample {
    String nullString = null;  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)

    public String showBug() {
        return nullString.toUpperCase();  // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    }
}