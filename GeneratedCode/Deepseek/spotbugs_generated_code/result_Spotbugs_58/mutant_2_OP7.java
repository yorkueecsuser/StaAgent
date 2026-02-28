public String getNullStringLength() {
    boolean conditionWhile = false;
    while (conditionWhile) {
        return "Length: " + nullString.length(); // Unreachable code
    }
    // The original buggy line is not removed; it remains in the code but is unreachable
    return "Length: " + nullString.length(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
}